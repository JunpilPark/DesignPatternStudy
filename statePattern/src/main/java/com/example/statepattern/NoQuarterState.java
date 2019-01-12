package com.example.statepattern;

public class NoQuarterState implements State {

    private GumBallMachine gumBallMachine;

    public NoQuarterState(GumBallMachine gumBallMachine) {
        this.gumBallMachine = gumBallMachine;
    }

    @Override
    public void insertQuarter() {
        gumBallMachine.setState(gumBallMachine.getHasQuarterState());
        System.out.println("동전이 삽입되었습니다. 손잡이를 돌려주세요.");

    }

    @Override
    public void returnQuarter() {
        System.out.println("동전이 없습니다. 동전을 넣어주세요.");
    }

    @Override
    public void turnCrank() {
        System.out.println("동전이 없습니다. 동전을 넣어주세요.");
    }

    @Override
    public void dispense() {
        System.out.println("동전이 없습니다. 동전을 넣어주세요.");
    }
}
