package com.bouneCompany.Factory.Before;

/**
    如果这个时候要添加卡夫奇诺咖啡，那么就需要修改内部源码，破坏了开闭原则
        在创建对象的时候，如果每一次都直接new该对象，那么会对该对象耦合严重，假如我们要修改对象，那么所有new对象的地方都要修改一边
        （比如说要把无参构造器改成有参构造器，那么所有new对象的地方都要改）
    需求：解耦咖啡店以及咖啡的耦合，通过工厂创建对象
 */
public class CoffeeStore {
    public Coffe orderCoffe(String type){
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
