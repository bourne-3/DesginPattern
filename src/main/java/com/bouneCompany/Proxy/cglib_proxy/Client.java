package com.bouneCompany.Proxy.cglib_proxy;

/**

 */
public class Client {

    public static void main(String[] args) {
        ProxyFactory factory = new ProxyFactory();
        TrainStation trainStation = factory.getTrainStationObj();
        trainStation.sell();
    }

    public void T() {

    }
}
