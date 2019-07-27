package com.training.helloWorldWithMVC;

public class View {

    public static final String WRONG_INPUT_DATA = "Wrong input! Repeat please! ";

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printStartMessage(String keyWordOne, String keyWordTwo){
        System.out.println("Input word \"" + keyWordOne +"\", then input word \"" + keyWordTwo + "\":");
    }

    public void printResultMessage(String keyWordOne, String keyWordTwo){
        System.out.println("The result is correct! \n" + keyWordOne + " " + keyWordTwo);
    }
}