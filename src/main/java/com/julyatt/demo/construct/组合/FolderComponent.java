package com.julyatt.demo.construct.组合;

/**
 * @author guosh28325
 * @date 2021-02-20
 */
public class FolderComponent extends BaseComponent {


    public FolderComponent(String name) {
        super(name);
    }

    @Override
    void action() {
        for (BaseComponent component : components) {
            component.action();
        }
    }
}
