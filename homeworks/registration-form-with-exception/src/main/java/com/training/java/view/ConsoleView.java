package com.training.java.view;

import java.util.Locale;
import java.util.ResourceBundle;

import static com.training.java.view.TextConstants.LOCALE_UA;
import static com.training.java.view.TextConstants.MESSAGES_BUNDLE_NAME;

public class ConsoleView {
    public static final ResourceBundle bundle = ResourceBundle
            .getBundle(MESSAGES_BUNDLE_NAME, new Locale(LOCALE_UA));

    public void printLocale(String[] localeMessage, String... messages) {
        StringBuilder concatenation = new StringBuilder();
        for (String message : localeMessage) {
            concatenation.append(bundle.getString(message));
        }
        for(String message : messages) {
            concatenation.append(message);
        }
        System.out.println(concatenation.toString());
    }

    public void printLocale(String localeMessage, String... messages) {
        StringBuilder concatenation =
                new StringBuilder(bundle.getString(localeMessage));
        for(String message : messages) {
            concatenation.append(message);
        }
        System.out.println(concatenation.toString());
    }

    public void print(String message) {
        System.out.println(message);
    }
}