package com.example.factory;

public class CheesePizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;

    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    void prepare() {
        dought = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSouce();
        cheese = pizzaIngredientFactory.createCheese();
        toppings.add("불고기");
        toppings.add("체다치즈");
        System.out.println(dought.getName());
        System.out.println(sauce.getName());
        System.out.println(cheese.getName());
    }

}
