package com.duke.pattern.adapter.object_adapter;

public class Client {

    public static void main(String[] args) {
        // 创建计算机对象
        Computer computer = new Computer();
        // 读取 SD 卡内容
        String msg = computer.readSD(new SDCardImpl());
        System.out.println(msg);

        // 读取 TF 卡中的内容
        String readSD = computer.readSD(new SDAdapterTF(new TFCardImpl()));
    }
}
