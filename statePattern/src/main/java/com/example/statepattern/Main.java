package com.example.statepattern;

public class Main {
    public static void main(String[] aregs) {
        GumBallMachine gumBallMachine = new GumBallMachine(10);
        gumBallMachine.insertQuarter();
        gumBallMachine.returnQuarter();
        gumBallMachine.insertQuarter();
        gumBallMachine.turnCrank();
        gumBallMachine.dispense();
    }
}
