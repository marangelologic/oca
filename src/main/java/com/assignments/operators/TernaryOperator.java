package com.assignments.operators;

public class TernaryOperator {

    public static void main(String[] args) {
        int x = 5;
        //you can chain ternary operators!!! but you need to add another logic check for false result and this will be reevaluated
        System.out.println(x > 6 ? "test" : x > 5 ? "test3" : "test6");
    }
}
