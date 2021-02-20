package com.julyatt.demo.create.factory.abstractfactory;

public class DellMouse extends Mouse {
    @Override
    public void click() {
        LOGGER.info("dell mouse click");
    }
}
