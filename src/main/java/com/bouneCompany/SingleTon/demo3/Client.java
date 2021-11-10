package com.bouneCompany.SingleTon.demo3;

/**
    懒汉式单例：类加载的时候不会创建对象，只有在使用到该类的时候才会创建对象

    步骤：
        1 私有化构造器
        2 定义一个类型为自身的成员变量，并且不要赋初始值
        3 使用一个静态的方法返回这个成员变量，这个时候在这个方法中创建这个对象
            不能直接创建；因为这样就破坏了单例了，需要先判断obj是否为null，是的话就需要创建。 最终return


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
