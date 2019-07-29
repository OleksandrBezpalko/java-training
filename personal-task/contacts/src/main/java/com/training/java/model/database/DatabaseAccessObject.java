package com.training.java.model.database;

import com.training.java.model.entities.User;
import com.training.java.model.entities.contacts.Contact;
import com.training.java.model.entities.contacts.Mail;
import com.training.java.model.entities.contacts.Skype;
import com.training.java.model.entities.contacts.Telephone;
import com.training.java.model.entities.contacts.socialNetwork.Facebook;
import com.training.java.model.entities.contacts.socialNetwork.Twitter;
import com.training.java.view.constants.TextConstants;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class DatabaseAccessObject {
    public DatabaseAccessObject(){}

    public void writeToDatabase (ArrayList<User> users){
        try(FileWriter writer = new FileWriter("database.txt", false))
        {
            for (User user : users) {
                writer.write(TextConstants.NAME);
                writer.write(user.getName() + "\n");
                writer.write(TextConstants.SURNAME);
                writer.write(user.getSurname()+ "\n");
                for (Contact contact: user.getContacts()) {
                    if (contact.getClass().toString().equals(Telephone.class.toString())){
                        writer.write(TextConstants.TELEPHONE);
                    }
                    if (contact.getClass().toString().equals(Skype.class.toString())){
                        writer.write(TextConstants.SKYPE);
                    }
                    if (contact.getClass().toString().equals(Mail.class.toString())){
                        writer.write(TextConstants.MAIL);
                    }
                    if (contact.getClass().toString().equals(Facebook.class.toString())){
                        writer.write(TextConstants.FACEBOOK);
                    }
                    if (contact.getClass().toString().equals(Twitter.class.toString())){
                        writer.write(TextConstants.TWITTER);
                    }
                    for (String data: contact.getData()) {
                        writer.write(data+ "\n");
                    }
                }
                writer.write(TextConstants.NEW_USER);
            }

            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }

    public ArrayList<User> readFromDatabase (){
        ArrayList<User> users =  new ArrayList<>();

        ArrayList<String> dataFromDataBase = readFromFile();
        User tempUser = new User();
        Telephone tempTelephone = new Telephone();
        Skype tempSkype = new Skype();
        Mail tempMail = new Mail();
        Facebook tempFacebook = new Facebook();
        Twitter tempTwitter = new Twitter();
        String currentSection = new String();

        for (int i = 0; i < dataFromDataBase.size(); i++) {

            switch (dataFromDataBase.get(i)){
                case "Name:": currentSection = "Name:";
                    i++;
                    break;
                case "Surname:": currentSection = "Surname:";
                    i++;
                    break;
                case "Telephone:":  currentSection = "Telephone:";
                tempTelephone = new Telephone();
                    i++;
                    break;
                case "Skype:": currentSection = "Skype:";
                    i++;
                    tempSkype = new Skype();
                        break;
                case "Mail:":  currentSection = "Mail:";
                    i++;
                    tempMail = new Mail();
                        break;
                case "Facebook:":  currentSection = "Facebook:";
                    i++;
                    tempFacebook = new Facebook();
                        break;
                case "Twitter:":  currentSection = "Twitter:";
                    i++;
                    tempTwitter = new Twitter();
                        break;
                case "New user": currentSection = "New user";
                    tryToAdd (users, tempUser, tempTelephone, tempSkype, tempMail, tempFacebook, tempTwitter);
                    tempUser = new User();
                    tempTelephone = new Telephone();
                    tempSkype = new Skype();
                    tempMail = new Mail();
                    tempFacebook = new Facebook();
                    tempTwitter = new Twitter();
                    break;
            }

            switch (currentSection){
                case "Name:": tempUser.setName(dataFromDataBase.get(i));
                    break;
                case "Surname:": tempUser.setSurname(dataFromDataBase.get(i));
                    break;
                case "Telephone:":  tempTelephone.addContactData(dataFromDataBase.get(i));
                    break;
                case "Skype:": tempSkype.addContactData(dataFromDataBase.get(i));
                    break;
                case "Mail:": tempMail.addContactData(dataFromDataBase.get(i));
                    break;
                case "Facebook:": tempFacebook.addContactData(dataFromDataBase.get(i));
                    break;
                case "Twitter:": tempTwitter.addContactData(dataFromDataBase.get(i));
                    break;
            }
        }


        return users;
    }

    private ArrayList<String> readFromFile (){
        ArrayList<String> result = new ArrayList<>();

        try(FileReader reader = new FileReader("database.txt"))
        {
            int c;
            StringBuilder tempString = new StringBuilder();
            while((c=reader.read())!=-1){
                if (((char)c) == '\n'){
                    result.add(tempString.toString());
                    tempString = new StringBuilder();
                } else{
                    tempString.append((char)c);
                }
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

        return result;
    }

    private void tryToAdd (ArrayList<User> users, User user, Telephone telephone, Skype skype, Mail mail, Facebook facebook, Twitter twitter){
        if (!(user.getName() == null) && !(user.getSurname() == null)){
            ArrayList<Contact> contacts = new ArrayList<>();
            if (telephone.getData().size() != 0){
                contacts.add(telephone);
            }
            if (skype.getData().size() != 0){
                contacts.add(skype);
            }
            if (mail.getData().size() != 0){
                contacts.add(mail);
            }
            if (facebook.getData().size() != 0){
                contacts.add(facebook);
            }
            if (twitter.getData().size() != 0){
                contacts.add(twitter);
            }
            user.setContacts(contacts);
            users.add(user);
        }
    }
}
