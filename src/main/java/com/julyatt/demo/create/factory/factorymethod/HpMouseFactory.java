package com.julyatt.demo.create.factory.factorymethod;

/**
 * Description
 * 惠普鼠标工厂
 * @author guosh
 * @date 2019-06-27 16:29
 */
public class HpMouseFactory implements MouseFactory {

    @Override
    public AbstractMouse createMouse() {
        return new HpMouse();
    }
}
