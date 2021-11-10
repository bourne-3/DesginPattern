package com.bouneCompany.Principles.P1;

/**

 */
public class SougouInput {

    // 聚合了AbstractSkin类 因为我在内部使用了它
    // 成员遍历用了它 聚合；  如果是参数使用到了他 就是依赖
    AbstractSkin skin;

    public void setSkin(AbstractSkin skin) {
        this.skin = skin;
    }

    void display(){
        skin.display();
    }
}
