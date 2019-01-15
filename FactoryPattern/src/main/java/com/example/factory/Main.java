package com.example.factory;

public class Main {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NyPizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        Pizza pizza = nyPizzaStore.orderPizza("cheese");
        System.out.println(pizza.getName() + "피자를 주문 했습니다.");

        pizza = chicagoPizzaStore.orderPizza("pepperoni");
        System.out.println(pizza.getName() + "피자를 주문 했습니다.");
    }
}
