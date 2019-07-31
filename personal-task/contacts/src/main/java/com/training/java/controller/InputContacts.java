package com.training.java.controller;

import com.training.java.controller.constants.RegularExpressions;
import com.training.java.model.Model;
import com.training.java.model.entities.contacts.Mail;
import com.training.java.model.entities.contacts.Skype;
import com.training.java.model.entities.contacts.Telephone;
import com.training.java.model.entities.contacts.social_network.Facebook;
import com.training.java.model.entities.contacts.social_network.SocialNetwork;
import com.training.java.model.entities.contacts.social_network.Twitter;
import com.training.java.view.View;

import java.util.Scanner;

import static com.training.java.view.constants.TextConstants.*;

public class InputContacts {

    private View view;
    private Model model;
    private Scanner sc;
    private SocialNetwork socialNetwork;

    public InputContacts(View view, Model model, Scanner sc) {
        this.view = view;
        this.model = model;
        this.sc = sc;
    }

    public void start() {
        UtilityController utilityController =
                new UtilityController(sc, view, model);
        switch (String.valueOf(View.bundle.getLocale())) {
            case "ua":
                model.user.setName(utilityController.inputStringValueWithScanner
                        (INPUT_FIRST_NAME, RegularExpressions.REGEX_NAME_UA));
                model.user.setSurname(utilityController.inputStringValueWithScanner
                        (INPUT_SURNAME, RegularExpressions.REGEX_SURNAME_UA));
                model.user.addContact(new Telephone(utilityController.inputStringValueWithScanner
                        (INPUT_MOBILE_PHONE_NUMBER, RegularExpressions.REGEX_PHONE_NUMBER)));
                model.user.addContact(new Mail(utilityController.inputStringValueWithScanner
                        (INPUT_EMAIL, RegularExpressions.REGEX_EMAIL)));
                model.user.addContact(new Skype(utilityController.inputStringValueWithScanner
                        (INPUT_SKYPE, RegularExpressions.REGEX_SKYPE)));
                socialNetwork = utilityController.inputNameOfSocialNetWork(INPUT_NAME_OF_SOCIAL_NETWORK);
                if (socialNetwork.getClass().toString().equals(Facebook.class.toString())){
                    model.user.addContact(new Facebook(utilityController.inputStringValueWithScanner
                            (INPUT_SOCIAL_NETWORK, RegularExpressions.REGEX_SOCIAL_NETWORK)));
                }
                if (socialNetwork.getClass().toString().equals(Twitter.class.toString())){
                    model.user.addContact(new Twitter(utilityController.inputStringValueWithScanner
                            (INPUT_SOCIAL_NETWORK, RegularExpressions.REGEX_SOCIAL_NETWORK)));
                }
                break;
            default:
                model.user.setName(utilityController.inputStringValueWithScanner
                        (INPUT_FIRST_NAME, RegularExpressions.REGEX_NAME_EN));
                model.user.setSurname(utilityController.inputStringValueWithScanner
                        (INPUT_SURNAME, RegularExpressions.REGEX_SURNAME_EN));
                model.user.addContact(new Telephone(utilityController.inputStringValueWithScanner
                        (INPUT_MOBILE_PHONE_NUMBER, RegularExpressions.REGEX_PHONE_NUMBER)));
                model.user.addContact(new Mail(utilityController.inputStringValueWithScanner
                        (INPUT_EMAIL, RegularExpressions.REGEX_EMAIL)));
                model.user.addContact(new Skype(utilityController.inputStringValueWithScanner
                        (INPUT_SKYPE, RegularExpressions.REGEX_SKYPE)));
                socialNetwork = utilityController.inputNameOfSocialNetWork(INPUT_NAME_OF_SOCIAL_NETWORK);
                if (socialNetwork.getClass().toString().equals(Facebook.class.toString())){
                    model.user.addContact(new Facebook(utilityController.inputStringValueWithScanner
                            (INPUT_SOCIAL_NETWORK, RegularExpressions.REGEX_SOCIAL_NETWORK)));
                }
                if (socialNetwork.getClass().toString().equals(Twitter.class.toString())){
                    model.user.addContact(new Twitter(utilityController.inputStringValueWithScanner
                            (INPUT_SOCIAL_NETWORK, RegularExpressions.REGEX_SOCIAL_NETWORK)));
                }
        }


    }
}
