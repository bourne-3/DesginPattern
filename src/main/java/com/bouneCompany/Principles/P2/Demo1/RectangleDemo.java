package com.bouneCompany.Principles.P2.Demo1;

/**
    里氏代原则，父类出现的地方子类也可以出现，也就是说子类尽量不要去重写父类的方法，而更多的是实现扩展
    下面这个demo是一个错误的示范，重写了get的方法 导致 父类可以出现的地方 而子类无法使用
 */
public class RectangleDemo {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(20);
        rectangle.setWidth(10);
        printInfo(rectangle);
        System.out.println("调用 resize ===================");
        // 调用resize
        resize(rectangle);
        printInfo(rectangle);

        System.out.println("===================== 换成正方形");
        // ========== 以上是长方形，现在要使用正方形
        Square square = new Square();
        square.setLength(12);
        printInfo(square);

        // 正方形在这里就用不了resize了
        resize(square);  // 一直卡死了
    }

    // 传入参数 ： 依赖关系
    public static void resize(Rectangle rectangle){
        while (rectangle.width <= rectangle.length){
            // 使得宽度大于长度
            rectangle.setWidth(rectangle.width + 1);
        }
    }

    public static void printInfo(Rectangle rectangle){
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getWidth());
    }
}
