package com.duke.pattern.build.dome1;

public class OfoBuilder extends Builder {
    @Override
    public void buildFrame() {
        bike.setFrame("碳架构");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("塑料座垫");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
