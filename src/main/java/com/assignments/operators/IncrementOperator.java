package com.assignments.operators;

public class IncrementOperator {
    public static void main(String[] args) {

        int i = 1;
        int x = i++;
        // in Java the assignment operator takes precedence before the operation in postfix, so the value
        //of 'i' has already been assigned before the + 1 is triggered and x will always be the first value of i which is one
        System.out.println(i);

        System.out.println("the value of x is: " + x);
    }
}
