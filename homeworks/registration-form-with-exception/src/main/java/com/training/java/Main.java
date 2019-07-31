package com.training.java;

import com.training.java.controller.Controller;
import com.training.java.model.RecordsBase;
import com.training.java.view.ConsoleView;

public class Main {
    public static void main(String[] args) {
        RecordsBase recordsBase = new RecordsBase();
        ConsoleView view = new ConsoleView();
        Controller controller = new Controller(recordsBase, view);
        controller.processUser();
    }
}
