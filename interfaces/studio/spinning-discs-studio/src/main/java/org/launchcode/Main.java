package org.launchcode;

public class Main {
    public static void main(String[] args) {
        CD myCd = new CD("Sample CD", 700);
        DVD myDVD = new DVD("Sample DVD", 4);

        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.

        myCd.spinDisc();
        myCd.storeData();
        myCd.writeData();
        myCd.readData();
        myCd.reportInformation();
        myCd.customMethod();

        System.out.println();

        myDVD.spinDisc();
        myDVD.storeData();
        myDVD.writeData();
        myDVD.readData();
        myDVD.reportInformation();
        myDVD.customMethod();

    }
}