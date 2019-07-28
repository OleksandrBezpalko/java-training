package com.training.moreOrLessWithJUnit;

import java.util.Scanner;

public class Controller {

    private Model model;
    private View view;
    private int currentValue;
    private int resultOfComparison;
    private int minRange;
    private int maxRange;

    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }

    public void processUser(){
        Scanner sc = new Scanner(System.in);

        startStandardGame(sc);
        startUserGame(sc);

    }

    private void startStandardGame (Scanner sc){
        view.printMessage(view.STANDARD_START_MASSAGE);
        model.generateNumber();

        do{
            currentValue = inputIntValueWithScanner(sc);
            resultOfComparison = model.compareValue(currentValue);
            showResult(resultOfComparison);
        }
        while(resultOfComparison != 0);
    }

    private void startUserGame (Scanner sc){
        view.printMessage(view.STANDARD_USER_MASSAGE);

        do{
            minRange = inputIntValueWithScanner(sc);
            maxRange = inputIntValueWithScanner(sc);
        } while (!checkTheCondition(minRange, maxRange));

        model.generateNumber(minRange, maxRange);
        view.printRange(minRange, maxRange);

        do{
            currentValue = inputIntValueWithScanner(sc);
            resultOfComparison = model.compareValue(currentValue);
            showResult(resultOfComparison);
        }
        while(resultOfComparison != 0);
    }

    private boolean checkTheCondition(int min, int max) {
        if ((min < max) && ((min + 1) != max) ){ return true;
        } else{
            view.printMessage(View.WRONG_INPUT_DATA);
            return false;
        }
    }

    private void showResult (int resultOfComparison){
        view.printCurrentResult(model.getNumberOfIteration(), model.getMinRange(), model.getMaxRange(), currentValue);
        switch (resultOfComparison) {
            case 0:
                view.printMessage(View.NUMBER_IS_RIGHT);
                break;
            case 1:
                view.printMessage(View.NUMBER_IS_BIGGER);
                break;
            case -1:
                view.printMessage(View.NUMBER_IS_LESS);
                break;
        }
    }

    private int inputIntValueWithScanner(Scanner sc) {
        while ( ! sc.hasNextInt()){
            view.printMessage(View.WRONG_INPUT_DATA);
            sc.next();
        }
        return sc.nextInt();
    }

}
