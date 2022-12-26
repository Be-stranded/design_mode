package com.duke.pattern.proxy.static_proxy;

public class Client {

    public static void main(String[] args) {
        // 创建代售点对象
        ProxyPoint proxyPoint = new ProxyPoint();
        // 调用买票方法
        proxyPoint.sell();
    }

}
