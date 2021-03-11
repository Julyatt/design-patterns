package com.julyatt.demo.construct.组合;

/**
 * @author guosh28325
 * @date 2021-03-09
 */
public class Test {


    public static void main(String[] args) throws CloneNotSupportedException {
        FileComponent fileComponent = new FileComponent("1");
        FileComponent clone = (FileComponent) fileComponent.clone();
        System.out.println(fileComponent == clone);
        System.out.println(fileComponent.equals(clone));
        System.out.println(fileComponent.toString());
        System.out.println(clone.toString());
    }
}
