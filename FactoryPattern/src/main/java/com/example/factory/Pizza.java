package com.example.factory;

import java.util.ArrayList;

public abstract class Pizza {
    protected String name;
    protected Dough dought;
    protected Souce sauce;
    protected Cheese cheese;
    protected ArrayList toppings = new ArrayList();

    abstract void prepare();

    public void bake() {
        System.out.println("25분 동안 굽습니다.");
    }

    public void cut() {
        System.out.println("피자 조각으로 자릅니다.");
    }

    public void box() {
        System.out.println("포장합니다.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
