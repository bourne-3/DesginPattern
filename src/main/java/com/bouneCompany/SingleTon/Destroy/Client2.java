package com.bouneCompany.SingleTon.Destroy;

import java.lang.reflect.Constructor;

/**

 */
public class Client2 {

    public static void main(String[] args) throws Exception {
        Class<d1> clazz = d1.class;
        Constructor<d1> cons = clazz.getDeclaredConstructor();
        cons.setAccessible(true);

        // 通过反射的方法也发现可以破坏单例模式
        d1 obj = cons.newInstance();
        d1 obj2 = cons.newInstance();
        System.out.println(obj);
        System.out.println(obj2);
    }


}
