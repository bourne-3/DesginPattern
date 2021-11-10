package com.bouneCompany.Principles.P4;

/**
    迪米特法则： 如果两个软件实体无需直接通讯，那么就不应当发生直接的相互调用。
    可以通过第三方转发该调用。 目的：降低耦合，提供模块独立性
 */
public class Client {

    public static void main(String[] args) {
        Company company = new Company("yaya公司");
        Fans fans = new Fans("小木小粉丝");
        Star star = new Star("Bourne");
        Agent agent = new Agent();
        agent.setCompany(company);
        agent.setFans(fans);
        agent.setStar(star);

        // 调用agent的方法
        agent.meeting();
        agent.business();

    }

    public void T() {

    }
}
