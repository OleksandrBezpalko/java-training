package com.training.java.exceptions;

public class ExampleTryCatchFinally {
    public static void main(String[] args) {
        try {
            System.err.print(" 0");
            System.err.print(" 1");
        } catch(Error e) {
            System.err.print(" 2");
        } finally {
            System.err.print(" 3");
        }
        System.err.print(" 4");
    }
}
