package com.julyatt.demo.create.property;

/**
 * @author guosh28325
 * @date 2021-03-11
 */
public class ComponentHead implements Property {

    private String face;

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
