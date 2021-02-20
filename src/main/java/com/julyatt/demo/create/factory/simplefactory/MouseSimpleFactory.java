package com.julyatt.demo.create.factory.simplefactory;

public class MouseSimpleFactory {

    private MouseSimpleFactory() {

    }

    public static Mouse createMouse(MouseType mouseType) {
        switch (mouseType) {
            case HP:
                return new DellMouse();
            case DELL:
                return new DellMouse();
            default:
                return null;
        }
    }

}
