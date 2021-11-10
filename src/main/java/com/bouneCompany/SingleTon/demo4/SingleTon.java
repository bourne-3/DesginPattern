package com.bouneCompany.SingleTon.demo4;

/**
    静态内部类的方法完成懒汉式
    好处：由于JVM在加载外部类的过程中，是不会加载静态内部类的，只有内部类的属性或者方法被调用时才会被加载，并初始化其静态属性。
        而且，由于该静态属性被static修饰了，所以保证其只会被实例化一次，这样，就严格保证了实例化顺序，顺便就解决了上面所说的指令重排序的问题。

    步骤：
        1 私有化构造器
        2 创建一个静态内部类，在内部声明并且初始化外部类的对象 （这里的外部类就是SingleTon）
        3 在外部类中，提供一个方法返回对象 （也就是使用 返回内部类的成员变量 （注意这个成员变量也要定义为static的）


 */
public class SingleTon {

    private SingleTon(){}

    static class InteralClass{
        private final static SingleTon obj = new SingleTon();
    }

    public static SingleTon getSingleTonObj(){
        return InteralClass.obj;
    }
}
