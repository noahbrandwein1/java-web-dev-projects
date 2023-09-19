package org.launchcode;

public class DVD extends BaseDisc implements OpticalDisc {
    public DVD(String name, int capacity) {
        super(name, capacity);
    }

    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of 500 - 1600 rpm.");

    }

    @Override
    public void storeData() {
        System.out.println("Storing data on a DVD...");

    }

    @Override
    public void writeData() {
        System.out.println("Writing data on a DVD...");

    }

    @Override
    public void readData() {
        System.out.println("Reading data on a DVD...");

    }

    @Override
    public void reportInformation() {
        System.out.println("DVD - Name: " + name + ", Capacity: " + capacity + "GB");

    }
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
