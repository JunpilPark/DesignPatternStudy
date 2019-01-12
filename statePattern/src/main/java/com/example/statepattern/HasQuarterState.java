package com.example.statepattern;

public class HasQuarterState implements State{

    private GumBallMachine gumBallMachine;

    public HasQuarterState(GumBallMachine gumBallMachine) {
        this.gumBallMachine = gumBallMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("이미 동전이 들어가 있습니다.");
    }

    @Override
    public void returnQuarter() {
        gumBallMachine.setState(gumBallMachine.getNoQuarterState());
        System.out.println("동전을 반환하였습니다.");
    }

    @Override
    public void turnCrank() {
        gumBallMachine.setState(gumBallMachine.getSoldState());
        System.out.println("손잡이를 돌리셨습니다. 상품이 곧 나오면 꺼내주세요.");
    }

    @Override
    public void dispense() {
        System.out.println("아직 손잡이를 돌리지 않으셨습니다. 상품이 나오지 않았습니다.");
    }
}
