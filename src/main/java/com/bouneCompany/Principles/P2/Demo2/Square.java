package com.bouneCompany.Principles.P2.Demo2;

/**

 */
public class Square implements Quadrilateral {

    double size;

    public void setSize(double size) {
        this.size = size;
    }



    @Override
    public double getLength() {
        return size;
    }

    @Override
    public double getWidth() {
        return size;
    }
}
