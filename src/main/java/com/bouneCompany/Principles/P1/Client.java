package com.bouneCompany.Principles.P1;

/**
    开闭原则；对扩展开放，对修改关闭
    一般使用 接口和抽象类来实现  （内部的方法就是所谓的规范）
        当需求方式变化的时候，只需要根据需求重新派生一个实现类就可以了
    后期需要进行扩展，不需要修改原有的代码，而是直接重新去定义一个子实现类即可

 */
public class Client {

    public static void main(String[] args) {
        // 创建对象
        DefaultSkin defaultSkin = new DefaultSkin();
        YayaSkin yayaSkin = new YayaSkin();
        SougouInput input = new SougouInput();

        // 将DefaultSkin注入到SougouInput中
        // 注意这里由于多态，因此可以AbstractSkin可以接受DefaultSkin的类
        input.setSkin(defaultSkin);

        // 当然，也可以接受YayaSkin的类
        input.setSkin(yayaSkin);


        // 如果要更换别的皮肤，不需要修改SougouInput的源代码，仅仅需要重新写一个子类就可以了。
        // 比如这里要用一个逆局电视剧的皮肤
        NijuSkin nijuSkin = new NijuSkin();
        input.setSkin(nijuSkin);


        input.display();
    }

    public void T() {

    }
}
