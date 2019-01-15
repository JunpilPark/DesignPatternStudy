package com.example.factory;

public class NyPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        if(type.equals("cheese")) {
            return new NYStyleCheesePizza();
        }
        else if(type.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        }
        else {
            return null;
        }
    }
}
