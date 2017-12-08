package com.ian.small.domain;

public enum CatType {

    KEY("关键属性"), NONKEY("非关键属性"), SALES("销售属性");

    private String name;

    private CatType(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
