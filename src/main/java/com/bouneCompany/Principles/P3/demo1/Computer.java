package com.bouneCompany.Principles.P3.demo1;

/**
    依赖倒转原则

    高层模块和底层模块都需要依赖其抽象； （这里的依赖是指 我的成员变量用了你）
    细节应该依赖抽象 （细节 是指具体的实现类，抽象就是接口或者抽象类）  通俗的讲就是传入的参数应该是 抽象的，而不是具体的

 */
public class Computer {
    IntelCpu cpu;
    KingstonMemory memory;
    XiJieHardDisk hardDisk;

    public static void main(String[] args) {

    }

    public void run(){
        System.out.println("电脑启动.....");
        cpu.run();
        memory.save("在内存中存放数据");
        System.out.println(memory.get());
        hardDisk.save();
    }

    public IntelCpu getCpu() {
        return cpu;
    }

    public void setCpu(IntelCpu cpu) {
        this.cpu = cpu;
    }

    public KingstonMemory getMemory() {
        return memory;
    }

    public void setMemory(KingstonMemory memory) {
        this.memory = memory;
    }

    public XiJieHardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(XiJieHardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }
}
