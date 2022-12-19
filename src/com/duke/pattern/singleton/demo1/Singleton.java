package com.duke.pattern.singleton.demo1;

/**
 * 饿汉式：静态变量方式
 */
public class Singleton {

    // 1. 构造方法私有化
    private Singleton() {
    }

    // 2. 创建一个静态该对象
    private static Singleton instance;

    // 3. 对外提供静态方法获取该对象
    public static Singleton getInstance() {
        return instance;
    }
}
