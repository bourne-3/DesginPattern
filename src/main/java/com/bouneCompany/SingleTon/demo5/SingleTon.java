package com.bouneCompany.SingleTon.demo5;

/**
 枚举类实现单例模式是极力推荐的单例实现方式，因为枚举类型是线程安全的（也即它不会存在线程安全问题），并且只会装载一次

 单例实现中唯一一种不会被破坏的单例实现方式

 枚举方式其实是属于饿汉式的，所以如果你不考虑浪费内存空间的话，那么就首选枚举这种实现方式吧！
 */
public enum  SingleTon {
    INSTANCE;
}
