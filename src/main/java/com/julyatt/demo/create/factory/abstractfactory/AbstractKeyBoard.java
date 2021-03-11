package com.julyatt.demo.create.factory.abstractfactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Description
 * 抽象键盘
 * @author guosh
 * @date 2019-06-27 16:34
 */
public abstract class AbstractKeyBoard {

    String name;

    protected static final Logger LOGGER = LoggerFactory.getLogger(AbstractKeyBoard.class);

    /**
     * 键盘方法
     */
    public abstract void typec();

}
