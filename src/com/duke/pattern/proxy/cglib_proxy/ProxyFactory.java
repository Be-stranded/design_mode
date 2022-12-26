package com.duke.pattern.proxy.cglib_proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 代理对象工厂 用来获取代理对象
 */
public class ProxyFactory implements MethodInterceptor {

    // 声明火车站对象
    private final TrainStation trainStation = new TrainStation();
    public TrainStation getProxyObject() {
        // 创建 Enhancer 对象 类似于 JDK 代理中的 proxy 类
        Enhancer enhancer = new Enhancer();
        // 设置父类的字节码对象
        enhancer.setSuperclass(TrainStation.class);
        // 设置回调函数
        enhancer.setCallback(this);
        // 创建代理对象
        return (TrainStation) enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("CGLIB 动态代理");
        return method.invoke(trainStation, objects);
    }
}
