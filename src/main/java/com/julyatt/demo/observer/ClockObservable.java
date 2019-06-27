package com.julyatt.demo.observer;

/**
 * @author: guosh
 * @date: 2019/6/27
 * @description: 实际的被观察者
 **/

public class ClockObservable extends Observable {

    @Override
    public void notifyObserver() {
        for (Observer observer : observerList) {
            observer.wakeUp();
        }

    }
}
