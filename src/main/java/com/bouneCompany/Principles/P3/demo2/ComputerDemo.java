package com.bouneCompany.Principles.P3.demo2;


/**
    解决方案： 向上抽取出接口

    使用新的子类实现CPU接口。 （前提是已经完成了依赖倒转  也就是 依赖 抽象 而不是细节。
 */
public class ComputerDemo {

    public static void main(String[] args) {
        Computer computer = new Computer();
        IntelCpu cpu = new IntelCpu();
        KingstonMemory memory = new KingstonMemory();
        XiJieHardDisk hardDisk = new XiJieHardDisk();

        computer.setCpu(cpu);
        computer.setHardDisk(hardDisk);
        computer.setMemory(memory);

        // 修改CPU，现在要使用AMD的Cpu了
        AMDCpu amdCpu = new AMDCpu();
        computer.setCpu(amdCpu);

        // 电脑启动
        computer.run();
    }


}
