package com.example.templete;

public class Coffee extends CaffeinBeverage{

    @Override
    public void brew() {
        System.out.println("필터를 통해 커피를 우려내는 중");
    }

    @Override
    public void addCodiments() {
        System.out.println("설탕과 우유를 추가하는 중");
    }

    public void boilWater() {
        System.out.println("물을 끓이는 중");
    }

    public void pourInCup() {
        System.out.println("컵에 따르는 중");
    }
}
