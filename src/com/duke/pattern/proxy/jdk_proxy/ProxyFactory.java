package com.duke.pattern.proxy.jdk_proxy;

import com.duke.pattern.proxy.static_proxy.SellTickets;
import com.duke.pattern.proxy.static_proxy.TrainStation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 获取代理对象的工厂类
 */
public class ProxyFactory {

    // 声明火车站对象
    private final TrainStation trainStation = new TrainStation();

    // 获取代理对象方法
    public SellTickets getProxyObject() {
        // 返回代理对象即可
        /**
         * ClassLoader loader: 类加载器，用于加载代理类。可以通过目标对象获取类加载器
         * Class<?>[] interfaces： 代理类实现的接口的字节码对象
         * InvocationHandler h： 代理对象的调用处理程序
         */
        return (SellTickets) Proxy.newProxyInstance(
                TrainStation.class.getClassLoader(),
                TrainStation.class.getInterfaces()  ,
                new InvocationHandler() {
                    /*
                        Object proxy: 代理对象 和 ProxyObject 对象是同一个对象，在 invoke 方法中基本不用
                        Method method： 对接口中的方法进行封装的 method 对象
                        Object[] args： 调用方法的实际参数
                        返回值：方法的返回值
                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("jdk 动态代理");
                        // 执行目标对象的方法
                        return method.invoke(trainStation, args);
                    }
                }
        );
    }

}
