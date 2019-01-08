package com.exmple.iterator;


import java.util.ArrayList;

public class BraekfastMenuIterator implements Iterator {
    private ArrayList<MenuItem> menuItems;
    private int numberOfItem  = 0;


    BraekfastMenuIterator(ArrayList menuItems) {
        this.menuItems = menuItems;
    }

    public Object next() {
        return menuItems.get(numberOfItem++);
    }

    public boolean hasNext() {
        if(numberOfItem < menuItems.size() && menuItems.size() > 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
