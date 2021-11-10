package com.bouneCompany.SingleTon.demo3;

/**

 */
public class SingleTon {

    private SingleTon(){}

    static SingleTon obj;

    public static SingleTon getObj() {
        obj = new SingleTon();
        return obj;
    }
}
