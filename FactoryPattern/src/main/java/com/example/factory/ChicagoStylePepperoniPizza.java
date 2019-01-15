package com.example.factory;

public class ChicagoStylePepperoniPizza extends Pizza {
    public ChicagoStylePepperoniPizza() {
        name = "시카고 스타일 페페로니 피자";
        dought = "시카고 스타일 두꺼운 도우";
        sauce = "매운 핫 소스";

        toppings.add("페페로니");
        toppings.add("고마산 치즈가루");
    }
}
