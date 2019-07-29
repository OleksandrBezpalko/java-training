package com.training.java.controller;

import com.training.java.controller.constants.RegularExpressions;
import com.training.java.model.Model;
import com.training.java.view.View;

import java.util.Scanner;

import static com.training.java.view.View.bundle;
import static com.training.java.view.constants.TextConstants.*;

public class Controller {

    private Model model;
    private View view;
    private String answer;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);
        InputContacts inputNoteNoteBook =
                new InputContacts(view, model, sc);
        inputNoteNoteBook.start();
        model.addUser(model.user);

        UtilityController utilityController =
                new UtilityController(sc, view, model);

        switch (String.valueOf(bundle.getLocale())) {
            case "ua":
                answer = utilityController.makeDecision(INPUT_SORT_QUESTION, bundle.getString(YES), bundle.getString(NO));
                if (answer.equals(bundle.getString(YES))){
                    model.sortUsers();
                    utilityController.showUsers(model.getUsers());
                }
                answer = utilityController.makeDecision(SEARCH_QUESTION, bundle.getString(YES), bundle.getString(NO));
                if (answer.equals(bundle.getString(YES))){
                    utilityController.showUsers(model.searchByAllContacts
                            (utilityController.inputStringValueWithScanner(INPUT_SEARCH_LINE, RegularExpressions.REGEX_SEARCH_UA)));
                }
                break;
                default:
                    answer = utilityController.makeDecision(INPUT_SORT_QUESTION, bundle.getString(YES), bundle.getString(NO));
                    if (answer.equals(bundle.getString(YES))){
                        model.sortUsers();
                        utilityController.showUsers(model.getUsers());
                    }
                    answer = utilityController.makeDecision(SEARCH_QUESTION, bundle.getString(YES), bundle.getString(NO));
                    if (answer.equals(bundle.getString(YES))){
                        utilityController.showUsers(model.searchByAllContacts
                                (utilityController.inputStringValueWithScanner(INPUT_SEARCH_LINE, RegularExpressions.REGEX_SEARCH_EN)));
                    }

        }

    }

}