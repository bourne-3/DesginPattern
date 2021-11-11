package com.bouneCompany.Factory.SimpleFactory;

/**
    将咖啡店与咖啡的耦合去除，加入一个中间类：SimpleCoffeeFactory。通过工厂来获得对象
        现在不用再自己去new对象了
    但是现在有引入一个新的耦合，就是简单工厂类和咖啡店的耦合，如果要修改咖啡类，还是需要修改简单工厂类的代码

    与之前的区别：
        工厂类的客户端有很多个，如果使用之前的方法，那么每个客户端的代码都需要修改。
        而对于现在这种简单工厂模式，只需要修改工厂内部的代码即可，省去了其他的操作

    封装了创建对象的过程，通过参数就可以直接获得对象。


 */
public class Client {

    public static void main(String[] args) {
        Coffe coffee = SimpleCoffeeFacotry.createCoffee("LatteCoffee");
        System.out.println(coffee.getName());

    }


}
