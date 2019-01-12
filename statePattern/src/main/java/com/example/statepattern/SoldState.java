package com.example.statepattern;

public class SoldState implements State {

    private GumBallMachine gumBallMachine;

    public SoldState(GumBallMachine gumBallMachine) {
        this.gumBallMachine = gumBallMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.print("잠깐만 기다려주세요. 상품이 나오고 있습니다.");
    }

    @Override
    public void returnQuarter() {
        System.out.print("삽입된 동전이 없습니다.");
    }

    @Override
    public void turnCrank() {
        System.out.print("상품이 나오고 있습니다. 손잡이는 이미 돌리셨습니다.");
    }

    @Override
    public void dispense() {
        gumBallMachine.releaseGumBall();
        System.out.print("상품을 꺼냈습니다.");

        if(gumBallMachine.getNumberOfGumBall() > 0 ) {
            gumBallMachine.setState(gumBallMachine.getNoQuarterState());
        }
        else {
            System.out.print("상품이 모두 팔렸습니다.");
            gumBallMachine.setState(gumBallMachine.getSoldOutState());
        }
    }
}
