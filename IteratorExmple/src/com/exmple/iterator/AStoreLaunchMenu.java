package com.exmple.iterator;

public class AStoreLaunchMenu implements Menu{
    private int MAX_MENU_COUNT = 5;
    private int lastMenuIdex = 0;

    private MenuItem[] menu;

    public AStoreLaunchMenu() {
        menu = new MenuItem[MAX_MENU_COUNT];
        addMenu("샌드위치","기본형 샌드위치",false,5);
        addMenu("불고기 샌드위치","한국 스타일의 불고기 샌드위치",false,9);
        addMenu("토마토 샌드위치","채식주의자들을 위한 기본형 샌드위치",false,3);
        addMenu("커피","향긋한 향기의 원두커피",false,4);
    }

    public void addMenu(String name, String description, boolean isVegetarian, float price) {
        if(lastMenuIdex < MAX_MENU_COUNT) {
            menu[lastMenuIdex] = new MenuItem(name, description, isVegetarian, price);
            lastMenuIdex ++;
        }
        else {
            System.out.print("don't add menu item. because, menu is full. ");
        }
    }

    public MenuItem[] getMenuItems() {
        return menu;
    }

    @Override
    public Iterator getIterator() {
        return new AStoreLaunchMenuIterator(menu);
    }

}
