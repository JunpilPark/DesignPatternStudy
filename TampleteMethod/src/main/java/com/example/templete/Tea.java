package com.example.templete;

public class Tea extends CaffeinBeverage{

    @Override
    public void brew() {
        System.out.println("차를 우려내는 중");
    }

    @Override
    public void addCodiments() {
        System.out.println("레몬을 추가하는 중");
    }

    public void boilWater() {
        System.out.println("물을 끓이는 중");
    }

    public void pourInCup() {
        System.out.println("컵에 따르는 중");
    }
}
