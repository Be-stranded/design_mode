package com.duke.pattern.singleton.demo3;

/**
 * 懒汉式
 */
public class Singleton {

    // 1. 私有化构造方法
    private Singleton() {
    }

    // 2. 声明一个该类的对象
    private static Singleton instance;

    // 3. 提供一个对外访问的方式
    public static synchronized Singleton getInstance() {
        // 如果不存在一个 Singleton 对象 我就创建这个对象 不然就使用原来的对象
        if (instance == null)
            instance = new Singleton();

        return instance;
    }
}
