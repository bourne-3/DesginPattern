package com.bouneCompany.Factory.Before;

/**
    如果这个时候要添加卡夫奇诺咖啡，那么就需要修改内部源码，破坏了开闭原则
 */
public class CoffeeStore {
    public void orderCoffe(String type){
        Coffe coffe = null;
        if ("AmericanCoffee".equals(type)){
            coffe = new AmericanCoffe();
        }else if("LatteCoffee".equals(type)){
            coffe = new LatteCoffee();
        }
        System.out.println(coffe.getName());;
        coffe.addMilk();
        coffe.addSugar();
    }

}
