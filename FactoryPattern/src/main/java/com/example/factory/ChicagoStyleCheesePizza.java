package com.example.factory;

public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        name = "시카고 스타일 치즈 피자";
        dought = "두꺼운 시카고 스타일 도우";
        sauce = "마리나라 소스";

        toppings.add("불고기");
        toppings.add("체다치즈");
    }
}
