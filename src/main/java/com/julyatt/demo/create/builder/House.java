package com.julyatt.demo.create.builder;

import javax.crypto.interfaces.PBEKey;

/**
 * 建造者模式
 * @author guosh28325
 * @date 2021-03-11
 */
public class House {
    private String sofa;

    private String tv;

    private String desk;

    public House(Build build) {
        this.sofa = build.sofa;
        this.desk = build.desk;
        this.tv = build.tv;
    }


    private static class Build {

        private String sofa;

        private String tv;

        private String desk;

        public Build sofa(String sofa) {
            this.sofa = sofa;
            return this;
        }

        public Build tv(String tv) {
            this.tv = tv;
            return this;
        }

        public Build desk(String desk) {
            this.desk = desk;
            return this;
        }

        public House build() {
            return new House(this);
        }

    }

    @Override
    public String toString() {
        return "House{" +
                "sofa='" + sofa + '\'' +
                ", tv='" + tv + '\'' +
                ", desk='" + desk + '\'' +
                '}';
    }

    public static void main(String[] args) {
        House build = new Build().desk("茶几").tv("sony电视").build();
        System.out.println(build.toString());
    }

}
