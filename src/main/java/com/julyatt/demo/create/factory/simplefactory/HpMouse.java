package com.julyatt.demo.create.factory.simplefactory;

public class HpMouse extends Mouse {
    //private static final Logger LOGGER = LoggerFactory.getLogger(HpMouse.class);

    @Override
    public void click() {
        LOGGER.info("hpmouse click");
    }
}
