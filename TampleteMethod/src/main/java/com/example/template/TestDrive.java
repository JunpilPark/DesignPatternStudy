package com.example.template;

public class TestDrive {
    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();

        System.out.println("차 준비중....");
        tea.prepareRecipe();

        System.out.println("===========================");

        System.out.println("커피 준비중....");
        coffee.prepareRecipe();
    }
}
