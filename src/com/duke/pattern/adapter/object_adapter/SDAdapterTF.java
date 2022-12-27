package com.duke.pattern.adapter.object_adapter;

/**
 * 适配器类
 */
public class SDAdapterTF implements SDCard {

    public TFCard tfCard;

    public SDAdapterTF(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public String readSD() {
        return tfCard.readTF();
    }

    @Override
    public void writeSD(String msg) {
        tfCard.writeTF(msg);
    }
}
