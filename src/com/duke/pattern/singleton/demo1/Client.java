package com.duke.pattern.singleton.demo1;

/**
 * 测试类
 */
public class Client {

    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
    }
}
