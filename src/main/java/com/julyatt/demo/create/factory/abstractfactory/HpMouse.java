package com.julyatt.demo.create.factory.abstractfactory;

public class HpMouse extends Mouse {
    //private static final Logger LOGGER = LoggerFactory.getLogger(HpMouse.class);

    @Override
    public void click() {
        LOGGER.info("hp mouse click");
    }
}
