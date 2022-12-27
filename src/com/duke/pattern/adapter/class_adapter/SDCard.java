package com.duke.pattern.adapter.class_adapter;

/**
 * 目标接口
 */
public interface SDCard {

    // 从 SD 卡读取数据
    String readSD();

    // 从 SD 卡中写数据
    void writeSD(String msg);

}
