package com.duke.pattern.prototype;

public class Realizetype implements Cloneable {

    @Override
    public Realizetype clone() throws CloneNotSupportedException {

        return (Realizetype)super.clone();
    }
}
