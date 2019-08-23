package com.training.java.controller;

import com.training.java.model.Model;
import com.training.java.model.entity.NotUniqueLoginException;
import com.training.java.model.entity.NoteBook;
import com.training.java.view.View;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        try{
        Connection con =
                DriverManager.
                        getConnection("jdbc:mysql://localhost:3306/db_for_rf2",
                                "root",
                                "UnprotectedPassword");
        Statement query = con.createStatement();
        Scanner sc = new Scanner(System.in);
        InputNoteNoteBook inputNoteNoteBook = new InputNoteNoteBook(view, sc);
        inputNoteNoteBook.inputNote();

        NoteBook noteBook = getNoteBook(inputNoteNoteBook,query);
        System.out.println(noteBook);}
        catch(Exception e){
            e.printStackTrace();
        }
    }

    private NoteBook getNoteBook(InputNoteNoteBook inputNoteNoteBook,Statement query) {
        NoteBook noteBook = null;
        while(true) {
            try {
                noteBook = new NoteBook(inputNoteNoteBook.getFirstName(),
                        inputNoteNoteBook.getLoginData(),query);
                break;
            } catch (NotUniqueLoginException e) {
                e.printStackTrace();
                System.out.println("Not Unique Login " + e.getLoginData());
                inputNoteNoteBook.inputLogin();
            }
        }
        return noteBook;
    }
}
