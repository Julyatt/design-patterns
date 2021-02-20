package com.julyatt.demo.construct.适配器;

/**
 * @author guosh28325
 * @date 2021-02-20
 */
public class Adapter implements IAdapter {
    private Service service;

    public Adapter(Service service) {
        this.service = service;
    }

    @Override
    public void adapter() {
        service.method();
    }
}
