package com.duke.pattern.adapter.object_adapter;

/**
 * 电脑类
 */
public class Computer {
    // 从 SD 卡读取数据
    public String readSD(SDCard sdCard) {
        if (sdCard == null) {
            throw new NullPointerException("SDCard 为空");
        }

        return sdCard.readSD();
    }
}
