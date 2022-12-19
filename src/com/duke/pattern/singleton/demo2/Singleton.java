package com.duke.pattern.singleton.demo2;

/**
 * 饿汉式：静态代码块
 */
public class Singleton {

    // 1. 构造方法私有化
    private Singleton() {
    }

    // 2. 声明变量
    private static final Singleton instance;

    // 3. 在静态代码块对变量进行赋值
    static {
        instance = new Singleton();
    }

    // 4. 对外提供一个获取该类的方式
    public static Singleton getInstance() {
        return instance;
    }
}
