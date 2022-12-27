package com.duke.pattern.adapter.class_adapter;

/**
 * 适配者的接口
 */
public interface TFCard {

    // 从 TF 卡读取数据
    String readTF();

    // 从 TF 卡中写数据
    void writeTF(String msg);
}
