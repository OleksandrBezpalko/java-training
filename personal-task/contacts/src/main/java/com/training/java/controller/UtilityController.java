package com.training.java.controller;

import com.training.java.model.Model;
import com.training.java.model.entities.User;
import com.training.java.model.entities.contacts.Contact;
import com.training.java.model.entities.contacts.Mail;
import com.training.java.model.entities.contacts.Skype;
import com.training.java.model.entities.contacts.Telephone;
import com.training.java.model.entities.contacts.social_network.Facebook;
import com.training.java.model.entities.contacts.social_network.SocialNetwork;
import com.training.java.model.entities.contacts.social_network.Twitter;
import com.training.java.view.View;
import com.training.java.view.constants.TextConstants;

import java.util.ArrayList;
import java.util.Scanner;

import static com.training.java.view.constants.TextConstants.WRONG_INPUT_DATA;

public class UtilityController {
    private Scanner scanner;
    private View view;
    private Model model;

    public UtilityController(Scanner scanner, View view, Model model) {
        this.scanner = scanner;
        this.view = view;
        this.model = model;
    }

    String inputStringValueWithScanner(String message, String regex) {
        String res;
        view.printStringInput(message);
        while( !(scanner.hasNext() &&
                (res = scanner.next()).matches(regex))) {
            view.printWrongStringInput(message);
        }
        return res;
    }

    SocialNetwork inputNameOfSocialNetWork(String message) {
        view.printStringInput(message);
        String temp;
        while(scanner.hasNext()){
            temp = scanner.next();
            if (temp.equals(TextConstants.FACEBOOK_CHECK) ){
                return new Facebook();
            }
            if (temp.equals(TextConstants.TWITTER_CHECK)){
                return new Twitter();
            }
            view.printWrongStringInput(message);
        }
        return null;
    }

    void showUsers (ArrayList<User> users){
        for (User user: users) {
            view.printMessage(view.concatenationString(TextConstants.NAME, user.getName()));
            view.printMessage(view.concatenationString(TextConstants.SURNAME, user.getSurname()));
            for (Contact contact: user.getContacts()) {
                if (contact.getClass().toString().equals(Telephone.class.toString())){
                    view.printMessageWithOutEnter(TextConstants.TELEPHONE);
                }
                if (contact.getClass().toString().equals(Skype.class.toString())){
                    view.printMessageWithOutEnter(TextConstants.SKYPE);
                }
                if (contact.getClass().toString().equals(Mail.class.toString())){
                    view.printMessageWithOutEnter(TextConstants.MAIL);
                }
                if (contact.getClass().toString().equals(Facebook.class.toString())){
                    view.printMessageWithOutEnter(TextConstants.FACEBOOK);
                }
                if (contact.getClass().toString().equals(Twitter.class.toString())){
                    view.printMessageWithOutEnter(TextConstants.TWITTER);
                }
                view.printMessage(contact.getData().toString());
            }
            view.printMessage("\n");
        }
    }

    String makeDecision (String message, String yesConstant, String noConstant){
        String temp = new String();
        view.printBundleMessage(message);
        while( scanner.hasNext()) {
            temp = scanner.next();
            if (temp.equals(yesConstant) || temp.equals(noConstant)) {
                return temp;
            }
            view.printBundleMessage(WRONG_INPUT_DATA);
            view.printBundleMessage(message);
        }
        return temp;
    }
}