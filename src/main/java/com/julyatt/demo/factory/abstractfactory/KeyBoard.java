package com.julyatt.demo.factory.abstractfactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Description
 *
 * @author guosh
 * @create 2019-06-27 16:34
 */
public abstract class KeyBoard {
    String name;
    protected static final Logger LOGGER = LoggerFactory.getLogger(KeyBoard.class);

    public abstract void typec();

}
