package com.bouneCompany.Principles.P5;

/**

 */
public class PetrolCar extends Car {


    public PetrolCar() {
    }

    public PetrolCar(Color color){
        this.color = color;
    }

    @Override
    public void move() {
        System.out.println("PetrolCar is moving...");
    }
}
