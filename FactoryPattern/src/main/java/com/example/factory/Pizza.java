package com.example.factory;

import java.util.ArrayList;

public abstract class Pizza {
    protected String name;
    protected String dought;
    protected String sauce;
    protected ArrayList toppings = new ArrayList();

    public void prepare() {
        System.out.println(name + "준비 중입니다.");
        System.out.println("도우를 빚고 있습니다.");
        System.out.println("소스를 추가 중입니다");
        System.out.println("토핑을 추가 합니다.");
        for(int i = 0 ; i < toppings.size() ; i++) {
            System.out.println("  " + toppings.get(i));
        }
    }

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
}
