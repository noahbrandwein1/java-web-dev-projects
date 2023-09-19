package org.launchcode;

public class CD extends BaseDisc implements OpticalDisc {
    public CD(String name, int capacity) {
        super(name, capacity);
    }

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of 200 - 500 rpm.");

    }

    @Override
    public void storeData() {
        System.out.println("Storing data on a CD...");

    }
    @Override
    public void writeData() {
        System.out.println("Writing data on a CD...");
    }

    @Override
    public void readData() {
        System.out.println("Reading data on a CD...");

    }

    @Override
    public void reportInformation() {
        System.out.println("CD - Name: " + name + "capacity: " + capacity + "MB");

    }
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
