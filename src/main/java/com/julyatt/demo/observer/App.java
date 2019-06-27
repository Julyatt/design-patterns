package com.julyatt.demo.observer;

/**
 * @author: guosh
 * @date: 2019/6/27
 * @description:
 **/

public class App {
    public static void main(String[] args) {
        Observable observable = new ClockObservable();
        Observer observer = new Boys();
        observable.addObserver(observer);
        observable.addObserver(new Girls());
        observable.notifyObserver();
        observable.removeObserver(observer);
        observable.notifyObserver();
    }


}
