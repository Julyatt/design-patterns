package com.julyatt.demo.create.factory.factorymethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author guosh
 * @date 2019-06-27 16:29
 */
 public abstract class AbstractMouse {

    protected static final Logger LOGGER = LoggerFactory.getLogger(AbstractMouse.class);

    /**
     * 鼠标事件
     */
    public abstract void click();
}
