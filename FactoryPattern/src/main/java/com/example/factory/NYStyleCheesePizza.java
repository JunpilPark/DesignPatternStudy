package com.example.factory;

public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        name = "뉴욕 스타일 치즈 피자";
        dought = "치즈 크러스트 도우";
        sauce = "마리나라 소스";

        toppings.add("불고기");
        toppings.add("체다치즈");
    }
}
