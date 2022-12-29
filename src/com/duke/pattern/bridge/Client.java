package com.duke.pattern.bridge;

public class Client {

    public static void main(String[] args) {
        OperatingSystem operatingSystem = new Windows(new RMVBFile());
        operatingSystem.play("test");
    }

}
