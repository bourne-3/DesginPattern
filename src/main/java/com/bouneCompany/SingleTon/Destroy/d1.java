package com.bouneCompany.SingleTon.Destroy;

import java.io.Serializable;

/**

 */
public class d1 implements Serializable {

    // 静态内部类实现被破坏单例
    private d1(){}

    static class InterClass{
        private static final d1 d1Obj = new d1();
    }

    public static d1 getObj(){
        return InterClass.d1Obj;
    }


}
