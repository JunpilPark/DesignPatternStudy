package com.example.statepattern;

public class GumBallMachine {

    private int numberOfGumBall = 0;

    private State state ;
    private SoldOutState soldOutState;
    private NoQuarterState noQuarterState;
    private HasQuarterState hasQuarterState;
    private SoldState soldState;

    public GumBallMachine(int numberOfGum) {
        soldOutState = new SoldOutState(this);
        noQuarterState =  new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);

        state = soldOutState;
        this.numberOfGumBall = numberOfGum;

        if(numberOfGumBall > 0) {
            state = noQuarterState;
        }
    }

    public int getNumberOfGumBall() {
        return numberOfGumBall;
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void returnQuarter() {
        state.returnQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
    }

    public void dispense() {
        state.dispense();
    }

    public void setState(State state) {
        this.state = state;
    }

    public SoldOutState getSoldOutState() {
        return this.soldOutState;
    }

    public HasQuarterState getHasQuarterState() {
        return this.hasQuarterState;
    }

    public NoQuarterState getNoQuarterState() {
        return this.noQuarterState;
    }

    public SoldState getSoldState() {
        return this.soldState;
    }

    public void releaseGumBall() {
        if(numberOfGumBall > 0 ) {
            numberOfGumBall--;
        }
    }

}
