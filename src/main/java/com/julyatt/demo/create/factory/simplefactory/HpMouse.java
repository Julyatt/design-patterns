package com.julyatt.demo.create.factory.simplefactory;

/**
 * 惠普鼠标
 * @author guosh
 * @date 2019-06-27 16:29
 */
public class HpMouse extends AbstractMouse {
    //private static final Logger LOGGER = LoggerFactory.getLogger(HpMouse.class);

    @Override
    public void click() {
        LOGGER.info("hpmouse click");
    }
}
