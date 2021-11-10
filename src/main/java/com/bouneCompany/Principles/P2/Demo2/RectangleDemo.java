package com.bouneCompany.Principles.P2.Demo2;

/**
    修改 demo1 出现的错误


    子类可以拓展父类的功能，不可以修改父类的原有的功能 ===》 父类可以出现的地方，子类也可以实现
 */
public class RectangleDemo {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(20);
        rectangle.setWidth(10);
        Square square = new Square();
        square.setSize(30);

        // 都可以调用printInfo
        printInfo(rectangle);
        System.out.println("=========");
        printInfo(square);

        // 只有长方形可以调用resize
        resize(rectangle);
        System.out.println("=============");
        printInfo(rectangle);


    }

    // 传入参数 ： 依赖关系
    public static void resize(Rectangle rectangle){
        while (rectangle.width <= rectangle.length){
            // 使得宽度大于长度
            rectangle.setWidth(rectangle.width + 1);
        }
    }

    // 两者都可以调用printInfo
    public static void printInfo(Quadrilateral rectangle){
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getWidth());
    }
}
