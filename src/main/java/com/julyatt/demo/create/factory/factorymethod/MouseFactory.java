package com.julyatt.demo.create.factory.factorymethod;

/**
 * Description
 * 鼠标工厂
 * @author guosh
 * @date 2019-06-27 16:27
 */
public interface MouseFactory {
    /**
     * 生产鼠标
     * @return
     */
    AbstractMouse createMouse();
}
