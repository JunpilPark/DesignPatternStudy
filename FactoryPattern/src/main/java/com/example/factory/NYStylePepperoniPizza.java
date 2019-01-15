package com.example.factory;

public class NYStylePepperoniPizza extends Pizza {
    public NYStylePepperoniPizza() {
        name = "뉴욕 스타일 페페로니 피자";
        dought = "씬 도우";
        sauce = "매운 핫 소스";

        toppings.add("페페로니");
        toppings.add("고마산 치즈가루");
    }
}
