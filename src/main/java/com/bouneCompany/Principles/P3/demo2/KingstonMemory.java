package com.bouneCompany.Principles.P3.demo2;

/**

 */
public class KingstonMemory implements Memory{


    public String get(){
        return "Memory data..";
    }

    public void save(String data) {
        System.out.println("Memory saving data:" + data);
    }
}
