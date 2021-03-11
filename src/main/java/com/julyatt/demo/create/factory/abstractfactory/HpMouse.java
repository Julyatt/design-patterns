package com.julyatt.demo.create.factory.abstractfactory;

/**
 *  Description
 *  HP鼠标
 *  @author guosh
 *  @date 2019-06-27 16:34
 *
 */
public class HpMouse extends AbstractMouse {

    @Override
    public void click() {
        LOGGER.info("hp mouse click");
    }
}
