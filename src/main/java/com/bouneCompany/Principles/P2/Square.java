package com.bouneCompany.Principles.P2;

/**

 */
public class Square extends Rectangle {

    // 由于
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
