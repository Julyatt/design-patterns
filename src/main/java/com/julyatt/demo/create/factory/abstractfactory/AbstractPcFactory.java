package com.julyatt.demo.create.factory.abstractfactory;

/**
 * Description
 * 抽象工厂 产品族
 * @author guosh
 * @date 2019-06-27 16:44
 */
public abstract class AbstractPcFactory {

    /**
     * 创建鼠标
     * @return
     */
    abstract AbstractMouse createMouse();

    /**
     * 创建键盘
     * @return
     */
    abstract AbstractKeyBoard createKeyBoard();
}
