package com.training.java.controller;

import com.training.java.view.View;

import java.util.Scanner;

import static com.training.java.controller.RegexContainer.*;
import static com.training.java.view.TextConstant.*;

public class InputNoteNoteBook {
    private View view;
    private Scanner sc;

    private String firstName;
    private String loginData;

    public InputNoteNoteBook(View view, Scanner sc) {
        this.view = view;
        this.sc = sc;
    }

    public void inputNote() {
        UtilityController utilityController = new UtilityController(sc, view);
        String str = (String.valueOf(View.bundle.getLocale()).equals("ua"))
                ? REGEX_NAME_UKR : REGEX_NAME_LAT;

        this.firstName = utilityController.
                inputStringValueWithScanner(FIRST_NAME, str);
        this.loginData = utilityController.
                inputStringValueWithScanner(LOGIN_DATA, REGEX_LOGIN);
    }

    public void inputLogin(){
        UtilityController utilityController =
                new UtilityController(sc, view);
        this.loginData =
                utilityController.inputStringValueWithScanner
                 (LOGIN_DATA, REGEX_LOGIN);
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLoginData() {
        return loginData;
    }
}
