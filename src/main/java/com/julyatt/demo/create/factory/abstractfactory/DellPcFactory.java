package com.julyatt.demo.create.factory.abstractfactory;

import com.julyatt.demo.create.factory.abstractfactory.AbstractMouse;

/**
 * Description
 * 戴尔工厂
 * @author guosh
 * @date  2019-06-27 16:45
 */
public class DellPcFactory extends AbstractPcFactory {

    @Override
    public AbstractMouse createMouse() {
        return new DellMouse();
    }

    @Override
    public AbstractKeyBoard createKeyBoard() {
        return new DellKeyBoard();
    }
}
