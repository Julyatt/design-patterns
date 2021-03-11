package com.julyatt.demo.construct.组合;

import java.io.Serializable;
import java.util.PrimitiveIterator;

/**
 * @author guosh28325
 * @date 2021-02-20
 */
public class FileComponent extends BaseComponent implements Cloneable, Serializable {


    public FileComponent(String name) {
        super(name);
    }

    @Override
    void action() {
        System.out.println(name);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
