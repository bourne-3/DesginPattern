package com.bouneCompany.Proxy.jdk_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**

 */
public class ProxyFactory {


    TrainStation station = new TrainStation();

    public  SellTickets getProxyObj(){
        SellTickets sellTickets = (SellTickets) Proxy.newProxyInstance(
                station.getClass().getClassLoader(),
                station.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        String name = method.getName();
                        System.out.println("代理对象的方法名称为：" + name);

                        Object obj = method.invoke(station, args);// 在invoke方法中调用目标对象的方法。

                        System.out.println("invoke被调用");
                        return obj;
                    }
                }
        );

        return sellTickets;
    }
}
