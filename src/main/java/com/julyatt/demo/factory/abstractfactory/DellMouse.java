package com.julyatt.demo.factory.abstractfactory;

import com.julyatt.demo.factory.abstractfactory.Mouse;

public class DellMouse extends Mouse {
    @Override
    public void click() {
        LOGGER.info("dell mouse click");
    }
}
