package com.training.notebook;

import com.training.notebook.controller.Controller;
import com.training.notebook.model.Model;
import com.training.notebook.view.View;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Controller controller =
                new Controller(new Model(), new View());
        // Run
        controller.processUser();
    }
}

