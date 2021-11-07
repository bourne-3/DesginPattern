package com.bouneCompany.Proxy.jdk_proxy;

/**
    真实主题角色
 */
public class TrainStation implements SellTickets {


    @Override
    public void sell() {
        System.out.println("火车站卖票");
    }
}
