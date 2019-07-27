package com.training.notebook.controller;

import com.training.notebook.model.Model;
import com.training.notebook.view.View;

import java.util.Scanner;

import static com.training.notebook.view.TextConstant.*;

public class InputNoteNoteBook {

    private View view;
    private Model model;
    private Scanner sc;

    public InputNoteNoteBook(View view, Model model, Scanner sc) {
        this.view = view;
        this.model = model;
        this.sc = sc;
    }

    public void inputNote() {
        UtilityController utilityController =
                new UtilityController(sc, view);
        switch (String.valueOf(View.bundle.getLocale())) {
            case "ua":
                model.setFirstName(utilityController.inputStringValueWithScanner
                        (INPUT_FIRST_NAME, RegexContainer.REGEX_NAME_UA));
                model.setPatronymic(utilityController.inputStringValueWithScanner
                        (INPUT_PATRONYMIC, RegexContainer.REGEX_NAME_UA));
                model.setSurname(utilityController.inputStringValueWithScanner
                        (INPUT_SURNAME, RegexContainer.REGEX_NAME_UA));
                model.setLogin(utilityController.inputStringValueWithScanner
                        (INPUT_LOGIN_DATA, RegexContainer.REGEX_LOGIN));
                model.setComment(utilityController.inputStringValueWithScanner
                        (INPUT_COMMENT, RegexContainer.REGEX_COMMENT_UA));
                model.setHomePhoneNumber(utilityController.inputStringValueWithScanner
                        (INPUT_HOME_PHONE_NUMBER, RegexContainer.REGEX_PHONE_NUMBER));
                model.setMobilePhoneNumber(utilityController.inputStringValueWithScanner
                        (INPUT_MOBILE_PHONE_NUMBER, RegexContainer.REGEX_PHONE_NUMBER));
                model.setSecondMobilePhoneNumber(utilityController.inputStringValueWithScanner
                        (INPUT_SECOND_MOBILE_PHONE_NUMBER, RegexContainer.REGEX_PHONE_NUMBER_OPTIONAL));
                model.setEmail(utilityController.inputStringValueWithScanner
                        (INPUT_EMAIL, RegexContainer.REGEX_EMAIL));
                model.setSkype(utilityController.inputStringValueWithScanner
                        (INPUT_SKYPE, RegexContainer.REGEX_SKYPE));
                model.setIndex(utilityController.inputStringValueWithScanner
                        (INPUT_INDEX, RegexContainer.REGEX_INDEX));
                model.setCity(utilityController.inputStringValueWithScanner
                        (INPUT_CITY, RegexContainer.REGEX_CITY_UA));
                model.setStreet(utilityController.inputStringValueWithScanner
                        (INPUT_STREET, RegexContainer.REGEX_STREET_UA));
                model.setHouseNumber(utilityController.inputStringValueWithScanner
                        (INPUT_HOUSE_NUMBER, RegexContainer.REGEX_HOUSE_NUMBER_UA));
                model.setApartmentNumber(utilityController.inputStringValueWithScanner
                        (INPUT_APARTMENT_NUMBER, RegexContainer.REGEX_APARTMENT_NUMBER_UA));
                break;
            default:
                model.setFirstName(utilityController.inputStringValueWithScanner
                        (INPUT_FIRST_NAME, RegexContainer.REGEX_NAME_EN));
                model.setPatronymic(utilityController.inputStringValueWithScanner
                        (INPUT_PATRONYMIC, RegexContainer.REGEX_NAME_EN));
                model.setSurname(utilityController.inputStringValueWithScanner
                        (INPUT_SURNAME, RegexContainer.REGEX_NAME_EN));
                model.setLogin(utilityController.inputStringValueWithScanner
                        (INPUT_LOGIN_DATA, RegexContainer.REGEX_LOGIN));
                model.setComment(utilityController.inputStringValueWithScanner
                        (INPUT_COMMENT, RegexContainer.REGEX_COMMENT_EN));
                model.setHomePhoneNumber(utilityController.inputStringValueWithScanner
                        (INPUT_HOME_PHONE_NUMBER, RegexContainer.REGEX_PHONE_NUMBER));
                model.setMobilePhoneNumber(utilityController.inputStringValueWithScanner
                        (INPUT_MOBILE_PHONE_NUMBER, RegexContainer.REGEX_PHONE_NUMBER));
                model.setSecondMobilePhoneNumber(utilityController.inputStringValueWithScanner
                        (INPUT_SECOND_MOBILE_PHONE_NUMBER, RegexContainer.REGEX_PHONE_NUMBER_OPTIONAL));
                model.setEmail(utilityController.inputStringValueWithScanner
                        (INPUT_EMAIL, RegexContainer.REGEX_EMAIL));
                model.setSkype(utilityController.inputStringValueWithScanner
                        (INPUT_SKYPE, RegexContainer.REGEX_SKYPE));
                model.setIndex(utilityController.inputStringValueWithScanner
                        (INPUT_INDEX, RegexContainer.REGEX_INDEX));
                model.setCity(utilityController.inputStringValueWithScanner
                        (INPUT_CITY, RegexContainer.REGEX_CITY_EN));
                model.setStreet(utilityController.inputStringValueWithScanner
                        (INPUT_STREET, RegexContainer.REGEX_STREET_EN));
                model.setHouseNumber(utilityController.inputStringValueWithScanner
                        (INPUT_HOUSE_NUMBER, RegexContainer.REGEX_HOUSE_NUMBER_EN));
                model.setApartmentNumber(utilityController.inputStringValueWithScanner
                        (INPUT_APARTMENT_NUMBER, RegexContainer.REGEX_APARTMENT_NUMBER_EN));
        }


    }
}

