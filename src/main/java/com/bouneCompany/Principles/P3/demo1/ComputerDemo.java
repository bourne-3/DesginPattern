package com.bouneCompany.Principles.P3.demo1;

/**
    问题：如果现在想要更换Cpu了，不需要Intel，而是需要AMD的，那么这个时候怎么办？
        由于我们在Computer直接依赖了细节（也就是具体实现类） 要修改的话需要动到源代码，这里就打破了开闭原则

    因此就引入了 依赖倒转
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

        // 电脑启动
        computer.run();
    }


}
