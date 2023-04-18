package org.launchcode.studio7;

abstract class BaseDisk implements OpticalDisk{

    String diskType;
    String name;
    Double spinSpeed;
    Double storageCapacity;
    Double storageSpaceUsed;

    public BaseDisk(String diskType, String name, Double spinSpeed, Double storageCapacity, Double storageSpaceUsed) {
        this.diskType = diskType;
        this.name = name;
        this.spinSpeed = spinSpeed;
        this.storageCapacity = storageCapacity;
        this.storageSpaceUsed = storageSpaceUsed;
    }

    public void reportInfo(){
        Double availableStorage = this.storageCapacity - this.storageSpaceUsed;
        System.out.println("** " + this.diskType + " Information Report **\n" +
                " Name: " + this.name +
                "\n Total Capacity: "+ this.storageCapacity +
                "\n Used Storage: "+ this.storageSpaceUsed +
                "\n Available Storage: " + availableStorage + "\n");
    }
    @Override
    public void writeData(String dataName, Double dataSize){

        if (this.storageCapacity - storageSpaceUsed > dataSize){
            this.diskData.put(dataName, dataSize);
            this.storageSpaceUsed += dataSize;
            System.out.println("Success! Data has been added to the " + this.diskType);
            reportInfo();

        } else {
            System.out.println("** Error: There is not enough available space on the disk. **\n" +
                   "The " + this.diskType + " only has " + (storageCapacity - storageSpaceUsed) +
                    " but you needed " + dataSize + "\n");
        }


    }

}
