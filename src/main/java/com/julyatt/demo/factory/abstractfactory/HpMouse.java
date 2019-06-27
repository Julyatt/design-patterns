package com.julyatt.demo.factory.abstractfactory;

import com.julyatt.demo.factory.abstractfactory.Mouse;

public class HpMouse extends Mouse {
    //private static final Logger LOGGER = LoggerFactory.getLogger(HpMouse.class);

    @Override
    public void click() {
        LOGGER.info("hp mouse click");
    }
}
