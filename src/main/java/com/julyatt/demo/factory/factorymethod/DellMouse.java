package com.julyatt.demo.factory.factorymethod;

public class DellMouse extends Mouse {
    @Override
    public void click() {
        LOGGER.info("dell mouse click");
    }
}