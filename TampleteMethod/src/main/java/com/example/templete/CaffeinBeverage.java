package com.example.templete;

public abstract class CaffeinBeverage  {
    final void prepareRecipe() {
        // 기본적인 커피 or 차 만드는 프로세스
        boilWater(); // 물을 끓이기
        brew(); //  우려내기
        pourInCup(); // 컵에 따르고
        addCodiments(); // 첨가할 것들 첨가하기
    }
    abstract public void brew();
    abstract public void addCodiments();

    public void boilWater() {
        System.out.println("물을 끓이는 중");
    }
    public void pourInCup() {
        System.out.println("컵에 따르는 중");
    }

}
