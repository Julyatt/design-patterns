package com.julyatt.demo.create.factory.abstractfactory;

/**
 * Description
 * 惠普工厂
 * @author guosh
 * @date 2019-06-27 16:49
 */
public class HpPcFactory extends AbstractPcFactory {

    @Override
    public AbstractMouse createMouse() {
        return new HpMouse();
    }

    @Override
    public AbstractKeyBoard createKeyBoard() {
        return new HpKeyBoard();
    }
}
