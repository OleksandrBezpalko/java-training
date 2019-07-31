package com.training.java.controller;

import com.training.java.model.UserRecord;
import com.training.java.view.ConsoleView;

import java.util.Scanner;

import static com.training.java.controller.RegularExpressions.*;
import static com.training.java.view.TextConstants.*;

public class RecordInputer {
    private UserRecord record;
    private ConsoleView view;
    private Scanner scanner;

    public RecordInputer(ConsoleView view, Scanner scanner) {
        this.view = view;
        this.scanner = scanner;
        this.record = new UserRecord();
    }

    public UserRecord getRecord() {
        return record;
    }

    public void inputUserInformation() {
        view.printLocale(WELCOME_MESSAGE, BLANK_FIELD_VALUE);
        processNickname();
        processName();
        processSurname();
        processPatronymic();
        processComment();
        processPhoneNumber();
        processEmail();
        processPostcode();
        processCity();
        processStreet();
        processHouseNumber();
        processApartmentNumber();
    }

    public void processNickname() {
        record.setNickname(processField(NICKNAME, REGEX_NICKNAME));
    }

    public void processName() {
        record.setName(processField(NAME, REGEX_NAME));
    }

    public void processSurname() {
        record.setSurname(processField(SURNAME, REGEX_SURNAME));
    }

    public void processPatronymic() {
        record.setPatronymic(processField(PATRONYMIC, REGEX_PATRONYMIC));
    }

    public void processComment() {
        record.setComment(processField(COMMENT, REGEX_COMMENT));
    }

    public void processPhoneNumber() {
        record.setPhoneNumber(processField(PHONE_NUMBER, REGEX_PHONE_NUMBER));
    }

    public void processEmail() {
        record.setEmail(processField(EMAIL, REGEX_EMAIL));
    }

    public void processPostcode() {
        record.setPostcode(processField(POSTCODE, REGEX_POSTCODE));
    }

    public void processCity() {
        record.setCity(processField(CITY, REGEX_CITY));
    }

    public void processStreet() {
        record.setStreet(processField(STREET, REGEX_STREET));
    }

    public void processHouseNumber() {
        record.setHouseNumber(processField(HOUSE_NUMBER, REGEX_HOUSE_NUMBER));
    }

    public void processApartmentNumber() {
        record.setApartmentNumber(processField(APARTMENT_NUMBER, REGEX_APARTMENT_NUMBER));
    }

    private String processField(String fieldName, String regex) {
        view.printLocale(new String[]{ INPUT_VALUE, fieldName });
        String value = scanner.nextLine();
        while (!isValidFieldValue(value, regex)) {
            view.printLocale(INVALID_VALUE);
            value = scanner.nextLine();
        }
        return value;
    }

    private boolean isValidFieldValue(String value, String regex) {
        if (value.equals(BLANK_FIELD_VALUE)) {
            return true;
        }
        return value.matches(regex);
    }
}