package com.julyatt.demo.create.factory.abstractfactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class Mouse {

    protected static final Logger LOGGER = LoggerFactory.getLogger(Mouse.class);
    public abstract void click();
}
