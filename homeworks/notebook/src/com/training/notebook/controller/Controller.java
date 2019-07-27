package com.training.notebook.controller;

import com.training.notebook.model.Model;
import com.training.notebook.view.View;

import java.util.Scanner;

public class Controller {

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);
        InputNoteNoteBook inputNoteNoteBook =
                new InputNoteNoteBook(view, model, sc);
        inputNoteNoteBook.inputNote();
    }

}