package com.exmple.iterator;

public class Waitress {
    BreakfastMenu breakfastMenu = new BreakfastMenu();
    AStoreLaunchMenu launchMenu = new AStoreLaunchMenu();

    public void printMenu() {
        System.out.println("== 아침 메뉴 ==");
        printMenu(breakfastMenu.getIterator());
        System.out.println("== 점심 메뉴 ==");
        printMenu(launchMenu.getIterator());
    }

    public void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println("== " + menuItem.getMenu() + " : " + menuItem.getPrice());
            System.out.println("  " + menuItem.getDescription());
        }
    }
}
