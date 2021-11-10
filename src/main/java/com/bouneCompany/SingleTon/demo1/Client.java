package com.bouneCompany.SingleTon.demo1;

/**
    饿汉式单例：当类加载的时候，就会创建对象。
        有两种方法创建，一种是直接在成员变量new出来，一种是静态代码块  （其实都可以 这不是重点）

    单例的步骤：
        1 私有化构造器 （这样就不可以new了）
        2 创建一个类型为自身的成员变量
        3 写一个返回对象的函数 （因为不能用对象来调用，所以这里必须是 static的）  因此 上面的成员变量也必须是static的

    缺点：类加载的时候就会创建，如果并不需要使用它的话，它仍一直存在，因此可能产生内存的浪费
 */
public class Client {

    public static void main(String[] args) {
        Singleton obj = Singleton.getObj();
        System.out.println(obj);

        Singleton obj1 = Singleton.getObj();
        System.out.println(obj1);

        System.out.println(obj == obj1);
    }

    public void T() {

    }
}
