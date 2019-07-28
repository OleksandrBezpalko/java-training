package com.training.java.exceptions;

public class ExampleNoReturn {
    public static void main(String[] args) {
        double d = sqr(10.0);
        System.out.println(d);
    }
    public static double sqr(double arg) {
        throw new RuntimeException();
    }
}
