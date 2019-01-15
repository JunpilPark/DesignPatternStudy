package com.example.factory;

public class NyIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Souce createSouce() {
        return new HotSouce();
    }

    @Override
    public Cheese createCheese() {
        return new ChedaCheese();
    }
}
