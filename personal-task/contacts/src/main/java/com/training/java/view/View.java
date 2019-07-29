package com.training.java.view;

import java.util.Locale;
import java.util.ResourceBundle;

import static com.training.java.view.constants.TextConstants.INPUT_STRING_DATA;
import static com.training.java.view.constants.TextConstants.WRONG_INPUT_DATA;

public class View {

    static String MESSAGES_BUNDLE_NAME = "messages";
    public static ResourceBundle bundle = ResourceBundle.getBundle(MESSAGES_BUNDLE_NAME, new Locale("ua", "UA"));
//    public static ResourceBundle bundle = ResourceBundle.getBundle(MESSAGES_BUNDLE_NAME, Locale.ENGLISH);

    public void printMessage(String message){
        System.out.println(message);
    }
    public void printBundleMessage(String message){
        System.out.println( bundle.getString(message));
    }
    public void printMessageWithOutEnter(String message){
        System.out.print(message);
    }

    public String concatenationString(String... message){
        StringBuilder concatString = new StringBuilder();
        for(String v : message) {
            concatString = concatString.append(v);
        }
        return new String(concatString);
    }

    public void printStringInput(String message) {
        printMessage(concatenationString(
                bundle.getString(INPUT_STRING_DATA),
                bundle.getString(message)));
    }

    public void printWrongStringInput(String message) {
        printMessage(concatenationString(
                bundle.getString(WRONG_INPUT_DATA),
                bundle.getString(INPUT_STRING_DATA),
                bundle.getString(message)));
    }


}
