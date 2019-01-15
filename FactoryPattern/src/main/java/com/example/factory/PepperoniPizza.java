package com.example.factory;

public class PepperoniPizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;

    public PepperoniPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    void prepare() {
        dought = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSouce();
        cheese = pizzaIngredientFactory.createCheese();

        toppings.add("페페로니");
        toppings.add("고마산 치즈가루");
        System.out.println(dought.getName());
        System.out.println(sauce.getName());
        System.out.println(cheese.getName());
    }
}
