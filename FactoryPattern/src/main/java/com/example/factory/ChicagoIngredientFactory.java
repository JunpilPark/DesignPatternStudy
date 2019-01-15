package com.example.factory;

public class ChicagoIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Souce createSouce() {
        return new HotSouce();
    }

    @Override
    public Cheese createCheese() {
        return new PamasanCheese();
    }
}
