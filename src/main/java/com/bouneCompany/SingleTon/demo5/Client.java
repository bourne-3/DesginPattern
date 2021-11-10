package com.bouneCompany.SingleTon.demo5;

/**

 */
public class Client {

    public static void main(String[] args) {
        SingleTon i1 = SingleTon.INSTANCE;
        SingleTon i2 = SingleTon.INSTANCE;
        System.out.println(i1 == i2);
    }

    public void T() {

    }
}
