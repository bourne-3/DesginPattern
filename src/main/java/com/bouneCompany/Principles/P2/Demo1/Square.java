package com.bouneCompany.Principles.P2.Demo1;

/**

 */
public class Square extends Rectangle {

    // 由于正方形长和宽都是一样的，所以要设置为一致的，这里调用了父类的set
    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public void setWidth(double width) {
        super.setLength(width);
        super.setWidth(width);
    }
}
