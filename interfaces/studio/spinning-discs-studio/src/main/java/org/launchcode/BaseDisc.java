package org.launchcode;

// BaseDisc.java
abstract class BaseDisc {
    protected String name;
    protected int capacity;

    public BaseDisc(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}
