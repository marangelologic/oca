package com.flow.control.statement;

public class If {
    public static void main(String[] args) {
        System.out.println(shortCircuitTest());
    }


    //note for logical operator. Once we have a short circuit condition, if no parenthesis it will be evaluated from left to righ
    //this code will return false
    private static boolean shortCircuitTest() {
        int x = 2;
        int y = 5;
        return ((x > 3) && (y < 2) | true);
    }


    // if statement only accepts booelan, but may also set a value to booelan value.
    // say (if b= true), given that b is a boolean variable it will be compiled
    private static boolean testIntInIfElse() {
        int x = 5;
        if (x == 10) {

        }
    }
}
