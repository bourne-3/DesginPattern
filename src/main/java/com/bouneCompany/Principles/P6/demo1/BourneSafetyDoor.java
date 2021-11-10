package com.bouneCompany.Principles.P6.demo1;

/**

 */
public class BourneSafetyDoor implements SafetyDoor{


    @Override
    public void antiTheft() {
        System.out.println("防盗！！");
    }

    @Override
    public void fireproof() {
        System.out.println("防火！！");
    }

    @Override
    public void waterproof() {
        System.out.println("防水！！");
    }
}
