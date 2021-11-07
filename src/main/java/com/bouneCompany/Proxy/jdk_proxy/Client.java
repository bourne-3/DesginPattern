package com.bouneCompany.Proxy.jdk_proxy;

import com.bouneCompany.Proxy.static_proxy.ProxyPoint;

/**

 */
public class Client {

    public static void main(String[] args) {
        ProxyFactory factory = new ProxyFactory();
        SellTickets proxyObj = factory.getProxyObj();
        proxyObj.sell();

        // 代理类是在内存中动态生成的，如果我们的程序结束了，那么内存就会被释放掉，自然代理类我们就不会拿得到了。
        // 因此需要用一个死循环来debug
//        while (true){}
    }


}
