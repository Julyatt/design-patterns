package com.julyatt.demo.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: guosh
 * @date: 2019/6/27
 * @description: 被观察者
 **/

public abstract class Observable {
    private static final Logger LOGGER = LoggerFactory.getLogger(Observable.class);

    protected List<Observer> observerList = new ArrayList();

    public void addObserver(Observer observer) {
        observerList.add(observer);
        LOGGER.info("增加观察者" + observer.toString());
    }

    public void removeObserver(Observer observer) {
        if (observerList.contains(observer)) {
            observerList.remove(observer);
            LOGGER.info("移除观察者" + observer.toString());
        } else {
            LOGGER.info("要移除的观察者不存在");
        }
    }

    public abstract void notifyObserver();
}
