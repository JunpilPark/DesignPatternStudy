package com.exmple.iterator;

public class AStoreLaunchMenuIterator implements Iterator{
    private MenuItem[] menuItems;
    private int numberOfItems = 0;

    AStoreLaunchMenuIterator(MenuItem[] menuItems) {
        this.menuItems =  menuItems;
    }

    @Override
    public Object next() {
        return menuItems[numberOfItems++];
    }

    @Override
    public boolean hasNext() {
        if(numberOfItems < menuItems.length && menuItems[numberOfItems] != null ) {
            return true;
        }
        else {
            return false;
        }
    }
}
