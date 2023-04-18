package org.launchcode.studio7;

import java.util.HashMap;
import java.util.Map;

public interface OpticalDisk {

    final static HashMap<String, Double> diskData = new HashMap<>();

    static void spinDisk(String diskType, Double spinSpeed){
        System.out.println("A "+ diskType + " spins at a rate of "+ spinSpeed+ " rpm\n");
    }

    static void readDisk(BaseDisk disk){
        System.out.println("** Reading Data from " + disk.diskType + " **");
        for (Map.Entry<String, Double> data : diskData.entrySet()) {
                String key = data.getKey();
                Double value = data.getValue();
            System.out.println("Entry: "+ key + " with a data size of "+ value);
        }
        System.out.println("");
    }

    static void printLabel(BaseDisk disk, String lableTitle){
        System.out.println("** Printing " + disk.diskType + " Label **");
        System.out.println(" " + lableTitle +
                "\n Disk Name: " + disk.name +
                "\n Space Used: " + disk.storageSpaceUsed +
                "\n Space Available: " + (disk.storageCapacity - disk.storageSpaceUsed) + "\n");
    }

    void writeData(String dataName, Double dataSize);
    void reportInfo();


}