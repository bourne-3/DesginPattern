package com.bouneCompany.Principles.P4;

/**

 */
public class Agent {

    // 你们都是我的成员变量，因此你们都聚合与我  (聚合的定义）
    Star star;
    Company company;
    Fans fans;

    public void setStar(Star star) {
        this.star = star;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void setFans(Fans fans) {
        this.fans = fans;
    }

    void meeting(){
        System.out.println(fans.getName() + "与民星" + star.getName()+ "召开见面会...");
    }

    void business(){
        System.out.println(company.getName() + " 召开洽谈会...");
    }


}
