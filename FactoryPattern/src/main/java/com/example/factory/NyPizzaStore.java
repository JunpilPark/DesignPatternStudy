package com.example.factory;

public class NyPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new NyIngredientFactory();
        if(type.equals("cheese")) {
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("뉴욕 치즈피자");
            pizza.prepare();
            return pizza;
        }
        else if(type.equals("pepperoni")) {
            pizza =  new PepperoniPizza(pizzaIngredientFactory);
            pizza.setName("뉴욕 페페로니 피자");
            pizza.prepare();
            return pizza;
        }
        else {
            return null;
        }
    }
}
