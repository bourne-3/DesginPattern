package com.bouneCompany.Principles.P5;

/**

 */
public class Client {

    public static void main(String[] args) {
        White white = new White();
        // 在创建汽车对象的时候，就需要给它传递具体的颜色的子类对象了 （组合聚合复用） 这里聚合了Color
        PetrolCar petrolCar = new PetrolCar(white);
        petrolCar.color.showColor();
    }

    public void T() {

    }
}
