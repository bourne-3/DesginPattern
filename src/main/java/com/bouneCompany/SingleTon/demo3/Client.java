package com.bouneCompany.SingleTon.demo3;

/**

 */
public class Client {

    public static void main(String[] args) {
        SingleTon obj = SingleTon.getObj();
        System.out.println(obj);

        SingleTon obj1 = SingleTon.getObj();
        System.out.println(obj1);
    }

    public void T() {

    }
}
