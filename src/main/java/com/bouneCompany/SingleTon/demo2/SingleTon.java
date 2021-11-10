package com.bouneCompany.SingleTon.demo2;

import com.bouneCompany.SingleTon.demo1.Singleton;

/**

 */
public class SingleTon {

    static SingleTon obj;

    private SingleTon(){};

    static {
        obj = new SingleTon();
    }

    public static SingleTon getObj() {
        return obj;
    }
}
