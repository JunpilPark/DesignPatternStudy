package com.exmple.iterator;

public class MenuItem {
    private String menuName;
    private String description;
    private boolean vegetarian;
    private double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.menuName = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getMenu() {
        return menuName;
    }

    public String getDescription() {
        return description;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public double getPrice() {
        return price;
    }
}
