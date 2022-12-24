package com.duke.pattern.prototype;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        Realizetype realizetype = new Realizetype();
        Realizetype clone = realizetype.clone();
    }
    
}
