package com.duke.pattern.adapter.class_adapter;

/**
 * 适配者类
 */
public class TFCardImpl implements TFCard {
    @Override
    public String readTF() {
        return "TF 卡";
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("TF card write " + msg);
    }
}
