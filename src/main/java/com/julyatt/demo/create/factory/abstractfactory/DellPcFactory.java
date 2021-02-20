package com.julyatt.demo.create.factory.abstractfactory;

/**
 * Description
 *
 * @author guosh
 * @create 2019-06-27 16:45
 */
public class DellPcFactory extends PcFactory {
    @Override
    public Mouse createMouse() {
        return new DellMouse();
    }

    @Override
    public KeyBoard createKeyBoard() {
        return new DellKeyBoard();
    }
}
