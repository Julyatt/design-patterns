package com.julyatt.demo.factory.simplefactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HpMouse extends Mouse {
    //private static final Logger LOGGER = LoggerFactory.getLogger(HpMouse.class);

    @Override
    public void click() {
        LOGGER.info("hpmouse click");
    }
}
