package com.assignments.operators;

public class ArithmeticOperator {
    //The *, /, and % operators have higher precedence than + and –
    //this example will output 23
    // You cannot have a minus sign (-) when evaluating for string


    //Concatenation runs from left to right, and if either operand is a String, the
    //operands are concatenated. If both operands are numbers, they are added together
    public static void main(String[] args) {
      int i = 11 + 12 - 3 * 2 / 1 % 3;
        System.out.println(" " + 11 + 12 + 3 * 2 / 1 % 3);

        //this kind of syntax is also valid!!!!!!
        if(i<0) i++;
    }
}
