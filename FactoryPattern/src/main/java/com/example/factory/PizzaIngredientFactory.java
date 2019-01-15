package com.example.factory;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Souce createSouce();
    public Cheese createCheese();
}
