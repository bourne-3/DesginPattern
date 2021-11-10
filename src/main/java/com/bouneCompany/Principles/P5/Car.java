package com.bouneCompany.Principles.P5;

/**
    复用：继承复用 以及 合成聚合复用
        一般首先考虑 后者， 如果不行才会去考虑 前者
        （三个方面：封装性 耦合性 灵活性

 */
public abstract class Car {
    Color color;
    public abstract void move();
}
