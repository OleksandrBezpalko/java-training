package com.training.java;

import com.training.java.controller.Controller;
import com.training.java.model.Model;
import com.training.java.view.View;

public class Main {

    public static void main(String[] args) {
        Controller controller =
                new Controller(new Model(), new View());
        controller.processUser();
    }

}