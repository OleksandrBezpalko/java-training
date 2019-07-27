package com.training.helloWorldWithMVC;

import java.util.Scanner;

public class Controller {

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }

    public void processUser(){
        view.printStartMessage(model.getFirstKeyWord(), model.getSecondKeyWord());
        Scanner sc = new Scanner(System.in);
        boolean inputIsCorrect = false;

        do{
            String word1 = sc.nextLine();
            String word2 = sc.nextLine();
            inputIsCorrect = model.checkTheCondition(word1, word2);
            if (! inputIsCorrect){ view.printMessage(View.WRONG_INPUT_DATA); }
        }
        while(! inputIsCorrect);

        view.printResultMessage(model.getFirstKeyWord(), model.getSecondKeyWord());
    }
}
