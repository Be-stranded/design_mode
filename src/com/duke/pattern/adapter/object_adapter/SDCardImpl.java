package com.duke.pattern.adapter.object_adapter;

/**
 * 目标接口类
 */
public class SDCardImpl implements SDCard {
    @Override
    public String readSD() {
        return "SD 卡";
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("SD card write " + msg);
    }
}
