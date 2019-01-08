package com.exmple.iterator;

import java.util.ArrayList;

public class BreakfastMenu {
    private ArrayList<MenuItem> menu;

    public BreakfastMenu() {
        menu = new ArrayList<MenuItem>();
        addMenu("크롤레라 시리얼","우유 + 크롤레라", true, 2);
        addMenu("고구마와 우유세트","따뜻한 우유와 맛있는 고구마", true, 3);
        addMenu("과일세트","필수 영양소가 가득한 아침식사 대용 과일 세트", true, 5);
    }

    public void addMenu(String name, String description, boolean isVegetarian, float price) {
        menu.add(new MenuItem(name, description, isVegetarian, price));
    }

    public ArrayList getMenuItems() {
        return menu;
    }

    public Iterator getIterator() {
        return new BraekfastMenuIterator(menu);
    }

}
