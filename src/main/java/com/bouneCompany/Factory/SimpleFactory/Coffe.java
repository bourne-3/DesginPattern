package com.bouneCompany.Factory.SimpleFactory;

/**

 */
public abstract class Coffe {
    public abstract String getName();

    void addMilk(){
        System.out.println("addMilk..");
    }

    void addSugar(){
        System.out.println("addSugar..");
    }
}
