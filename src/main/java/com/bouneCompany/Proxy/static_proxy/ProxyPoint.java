package com.bouneCompany.Proxy.static_proxy;

/**
    代理类角色
 ProxyPoint作为访问对象和目标对象的中介，避免了访问对象直接去访问目标对象。同时也对sell方法进行了增强
 */
public class ProxyPoint implements SellTickets{

    TrainStation trainStation = new TrainStation();

    @Override
    public void sell() {
        System.out.println("您好，这里是火车代理处，需要接收代理费用");
        trainStation.sell();
    }
}
