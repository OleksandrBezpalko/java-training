package com.training.moreOrLess;

public class View {

    public static final String WRONG_INPUT_DATA = "Wrong input! Repeat please! ";
    public static final String NUMBER_IS_BIGGER = "Number is bigger!";
    public static final String NUMBER_IS_LESS = "Number is less!";
    public static final String NUMBER_IS_RIGHT = "You won! Congratulations!\n";
    public static final String STANDARD_START_MASSAGE = "Guess the number from 0 to 100!";
    public static final String STANDARD_USER_MASSAGE = "Enter two integers from -2 billion to 2 billion.\n" +
            "The first number should be less than the second.\n" +
            "This is the range in which the number will be generate.";

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printRange(int min, int max){
        System.out.println("Guess the number from " + min + " to "+ max + "!");
    }

    public void printCurrentResult (int numberOfIteration, int minRange, int maxRange, int currentValue){
        System.out.println("Number of attempts: " + numberOfIteration + "\n" +
                "The value is in the range: from " + minRange + " to " + maxRange + "\n" +
                "You have entered: " + currentValue);
    }

}
