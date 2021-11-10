package com.bouneCompany.Principles.P6.demo2;

/**
   接口隔离原则：客户端不应该被迫依赖于它不使用的方法，一个类对另一个类的以来应该建立在其最小的接口上
    前半部分使用一个继承可以形象理解。  解决 == 》 就是用 后半句话，最小化接口功能


    当需要哪个功能，就实现哪个接口，不会有多余的功能
 */
public class BourneSafetyDoor implements Fireproof, AntiTheft{

    public static void main(String[] args) {

    }

    public void T() {

    }

    @Override
    public void antiTheft() {
        System.out.println("防盗！");
    }

    @Override
    public void fireProof() {
        System.out.println("防火！");

    }
}
