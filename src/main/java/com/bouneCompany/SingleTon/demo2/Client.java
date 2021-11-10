package com.bouneCompany.SingleTon.demo2;

/**

 */
public class Client {

    public static void main(String[] args) {
        SingleTon obj = SingleTon.getObj();
        System.out.println(obj);

        SingleTon obj1 = SingleTon.getObj();
        System.out.println(obj1);

        System.out.println(obj1 == obj);
    }

    public void T() {

    }
}
