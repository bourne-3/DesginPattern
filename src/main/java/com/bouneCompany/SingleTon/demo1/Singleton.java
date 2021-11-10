package com.bouneCompany.SingleTon.demo1;

/**
 */
public class Singleton {
    static Singleton  singletonObj = new Singleton();

    private Singleton(){
    }

    public static Singleton getObj(){
        return singletonObj;
    }

}
