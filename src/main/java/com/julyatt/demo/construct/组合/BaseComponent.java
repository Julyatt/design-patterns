package com.julyatt.demo.construct.组合;

import java.util.ArrayList;
import java.util.List;

/**
 * @author guosh28325
 * @date 2021-02-20
 */
 public abstract class BaseComponent {

    protected String name;

    protected List<BaseComponent> components = new ArrayList<>();

    public BaseComponent(String name) {
        this.name = name;
    }

    private void add(BaseComponent component) {
        components.add(component);
    }

    private void remove(BaseComponent component) {
        components.remove(component);
    }

    /**
     *
     */
    abstract void action();


}
