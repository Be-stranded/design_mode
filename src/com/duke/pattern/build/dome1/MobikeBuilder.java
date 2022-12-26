package com.duke.pattern.build.dome1;

public class MobikeBuilder extends Builder {
    @Override
    public void buildFrame() {
        bike.setFrame("碳纤维车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("真皮座垫");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
