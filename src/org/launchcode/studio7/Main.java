package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        CD cd1 = new CD("cd1Name");
        OpticalDisk.spinDisk(cd1.diskType, cd1.spinSpeed);
        cd1.reportInfo();
        cd1.writeData("Data Name 1", 500.0);
        cd1.writeData("Data Name 2", 300.0);
        OpticalDisk.readDisk(cd1);
        OpticalDisk.printLabel(cd1, "CD Label Title");

        DVD dvd1 = new DVD("dvd1Name");
        OpticalDisk.spinDisk(dvd1.diskType, dvd1.spinSpeed);
        dvd1.reportInfo();
        dvd1.writeData("Data Name 1", 500.0);
        dvd1.writeData("Data Name 2", 300.0);
        OpticalDisk.readDisk(dvd1);
        OpticalDisk.printLabel(dvd1, "DVD Label Title");

        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.

    }
}
