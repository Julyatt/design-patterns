package com.julyatt.demo.create.factory.abstractfactory;

/**
 * Description
 * 戴尔鼠标
 * @author guosh
 * @date  2019-06-27 16:43
 */
public class DellMouse extends AbstractMouse {

    @Override
    public void click() {
        LOGGER.info("dell mouse click");
    }
}
