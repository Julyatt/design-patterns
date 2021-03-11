package com.julyatt.demo.create.factory.factorymethod;

/**
 *  * @author guosh
 *  * @date 2019-06-27 16:29
 */
public class DellMouse extends AbstractMouse {

    @Override
    public void click() {
        LOGGER.info("dell mouse click");
    }
}
