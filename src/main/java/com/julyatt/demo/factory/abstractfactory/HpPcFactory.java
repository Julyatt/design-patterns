package com.julyatt.demo.factory.abstractfactory;

/**
 * Description
 *
 * @author guosh
 * @create 2019-06-27 16:49
 */
public class HpPcFactory extends PcFactory {
    @Override
    public Mouse createMouse() {
        return new HpMouse();
    }

    @Override
    public KeyBoard createKeyBoard() {
        return new HpKeyBoard();
    }
}
