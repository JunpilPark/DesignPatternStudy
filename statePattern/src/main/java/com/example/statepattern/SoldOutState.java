package com.example.statepattern;

public class SoldOutState implements State {

    public GumBallMachine gumBallMachine;

    public  SoldOutState(GumBallMachine gumBallMachine) {
        this.gumBallMachine = gumBallMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("동전을 삽입할 수 없습니다. 물건이 다 판매되었습니다.");
    }

    @Override
    public void returnQuarter() {
        System.out.println("반환할 동전이 없습니다.");
    }

    @Override
    public void turnCrank() {
        System.out.println("동전을 삽입을 삽입하지 않았습니다. 손잡이를 돌릴 수 없습니다.");
    }

    @Override
    public void dispense() {
        System.out.println("손잡이를 돌리지 않았습니다. 상품이 없습니다.");
    }

}
