package com.bouneCompany.SingleTon.demo3;

/**

 */
public class SingleTon {

    private SingleTon(){}

    static SingleTon obj;

    public static SingleTon getObj() {
        // 为了防止每次调用getObj的时候都是创建一个新的对象，那这样就不是单例了
        if (obj == null){
            obj = new SingleTon();
        }
        return obj;
    }
}
