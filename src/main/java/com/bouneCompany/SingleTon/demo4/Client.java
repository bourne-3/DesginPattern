package com.bouneCompany.SingleTon.demo4;

/**

 */
public class Client {

    public static void main(String[] args) {
        SingleTon singleTonObj = SingleTon.getSingleTonObj();
        SingleTon singleTonObj2 = SingleTon.getSingleTonObj();
        System.out.println(singleTonObj == singleTonObj2);

    }

    public void T() {

    }
}
