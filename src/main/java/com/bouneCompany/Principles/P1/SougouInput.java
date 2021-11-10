package com.bouneCompany.Principles.P1;

/**

 */
public class SougouInput {

    // 聚合了AbstractSkin类 因为我在内部使用了它
    AbstractSkin skin;

    public void setSkin(AbstractSkin skin) {
        this.skin = skin;
    }

    void display(){
        skin.display();
    }
}
