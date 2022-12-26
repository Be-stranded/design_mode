package com.duke.pattern.build.dome1;

public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Bike construct() {
        this.builder.buildSeat();
        this.builder.buildFrame();
        return builder.createBike();
    }
}
