package com.bouneCompany.Factory.SimpleFactory;

/**

 */
public class SimpleCoffeeFacotry {

    static Coffe createCoffee(String type){
        Coffe coffe = null;
        if ("AmericanCoffee".equals(type)){
            coffe = new AmericanCoffe();
        }else if("LatteCoffee".equals(type)){
            coffe = new LatteCoffee();
        }
        System.out.println(coffe.getName());;
        coffe.addMilk();
        coffe.addSugar();
        return coffe;
    }
}
