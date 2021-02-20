package com.julyatt.demo.action.strategy;

/**
 * @author: guosh
 * @date: 2019/6/27
 * @description:
 **/

public class ApplicationContext {

    private Strategy strategy;

    public ApplicationContext(Strategy strategy) {
        this.strategy = strategy;
    }

    public void changeStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void goToStrategy() {
        strategy.execute();
    }

}
