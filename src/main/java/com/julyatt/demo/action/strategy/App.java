package com.julyatt.demo.action.strategy;

/**
 * @author: guosh
 * @date: 2019/6/27
 * @description:
 **/

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ApplicationContext(new ConcreteStrategyA());
        applicationContext.goToStrategy();
        applicationContext.changeStrategy(new ConcreteStrategyB());
        applicationContext.goToStrategy();
    }

}
