package com.julyatt.demo.create.factory.factorymethod;

/**
 * Description
 * 戴尔鼠标工厂
 * @author guosh
 * @date 2019-06-27 16:29
 */
public class DellMouseFactory implements MouseFactory {

    @Override
    public AbstractMouse createMouse() {
        return new DellMouse();
    }
}
