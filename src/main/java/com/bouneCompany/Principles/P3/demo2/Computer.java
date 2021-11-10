package com.bouneCompany.Principles.P3.demo2;

import com.bouneCompany.Principles.P3.demo1.IntelCpu;
import com.bouneCompany.Principles.P3.demo1.KingstonMemory;
import com.bouneCompany.Principles.P3.demo1.XiJieHardDisk;

/**
    依赖倒转原则

    高层模块和底层模块都需要依赖其抽象； （这里的依赖是指 我的成员变量用了你）
    细节应该依赖抽象 （细节 是指具体的实现类，抽象就是接口或者抽象类）  通俗的讲就是传入的参数应该是 抽象的，而不是具体的

 */
public class Computer {
    Cpu cpu;
    Memory memory;
    HardDisk hardDisk;

    public static void main(String[] args) {

    }

    public void run(){
        System.out.println("电脑启动.....");
        cpu.run();
        memory.save("在内存中存放数据");
        System.out.println(memory.get());
        hardDisk.save();
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

}
