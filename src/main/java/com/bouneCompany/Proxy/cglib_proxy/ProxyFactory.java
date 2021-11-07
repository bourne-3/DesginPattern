package com.bouneCompany.Proxy.cglib_proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**

 */
public class ProxyFactory implements MethodInterceptor {


    TrainStation trainStation = new TrainStation();
    public TrainStation getTrainStationObj(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(TrainStation.class);
        enhancer.setCallback(this);
        TrainStation obj = (TrainStation) enhancer.create();
        return obj;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("Cglib调用");
        System.out.println("在这里就可以还增强了");
        method.invoke(trainStation);
        return null;
    }
}
