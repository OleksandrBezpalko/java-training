package com.training.java.controller;

import com.training.java.model.NotUniqueNicknameException;
import com.training.java.model.RecordsBase;
import com.training.java.model.UserRecord;
import com.training.java.view.ConsoleView;

import java.util.Scanner;

import static com.training.java.view.TextConstants.NOT_UNIQUE_NICKNAME;

public class Controller {

    private RecordsBase recordsBase;
    private ConsoleView view;
    private Scanner scanner;

    public Controller(RecordsBase recordsBase, ConsoleView view) {
        this.recordsBase = recordsBase;
        this.view = view;
        this.scanner = new Scanner(System.in);
    }

    public void processUser() {
        RecordInputer recordInputer = new RecordInputer(view, scanner);
        recordInputer.inputUserInformation();
        UserRecord record = recordInputer.getRecord();
        initRecordsBase();
        while (true) {
            try {
                recordsBase.addRecord(record);
                break;
            } catch (NotUniqueNicknameException ex) {
                view.printLocale(NOT_UNIQUE_NICKNAME);
                recordInputer.processNickname();
            }
        }
        view.print(record.toString());
    }

    private void initRecordsBase() {
        try {
            recordsBase.addRecord(new UserRecord("apple", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"));
            recordsBase.addRecord(new UserRecord("banana", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"));
            recordsBase.addRecord(new UserRecord("pear", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"));
        } catch (NotUniqueNicknameException ex) {
            ex.printStackTrace();
        }
    }
}