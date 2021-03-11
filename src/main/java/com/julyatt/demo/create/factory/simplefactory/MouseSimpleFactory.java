package com.julyatt.demo.create.factory.simplefactory;

/**
 * 简单鼠标工厂
 * @author guosh
 * @date 2019-06-27 16:29
 */
public class MouseSimpleFactory {

    private MouseSimpleFactory() {

    }

    public static AbstractMouse createMouse(MouseTypeEnum mouseType) {
        switch (mouseType) {
            case HP:
                return new HpMouse();
            case DELL:
                return new DellMouse();
            default:
                return null;
        }
    }

}
