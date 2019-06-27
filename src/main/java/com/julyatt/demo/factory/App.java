package com.julyatt.demo.factory;

import com.julyatt.demo.factory.abstractfactory.DellPcFactory;
import com.julyatt.demo.factory.factorymethod.HpMouseFactory;
import com.julyatt.demo.factory.factorymethod.MouseFactory;
import com.julyatt.demo.factory.simplefactory.Mouse;
import com.julyatt.demo.factory.simplefactory.MouseSimpleFactory;
import com.julyatt.demo.factory.simplefactory.MouseType;

public class App {


    public static void main(String[] args) {
        /**
         * 简单工厂
         */
        Mouse mouse = MouseSimpleFactory.createMouse(MouseType.DELL);
        mouse.click();

        /**
         * 工厂方法
         */
        MouseFactory mouseFactory = new HpMouseFactory();
        mouseFactory.createMouse().click();

        /**
         * 抽象工厂
         */
        DellPcFactory dellPcFactory = new DellPcFactory();
        dellPcFactory.createKeyBoard().typec();
        dellPcFactory.createMouse().click();
    }
}
