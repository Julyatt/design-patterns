package com.julyatt.demo.factory.factorymethod;

/**
 * Description
 *
 * @author guosh
 * @create 2019-06-27 16:29
 */
public class HpMouseFactory implements MouseFactory {
    public Mouse createMouse() {
        return new HpMouse();
    }
}
