package com.training.java.model.servicies;

import com.training.java.model.entities.User;
import com.training.java.model.entities.contacts.Contact;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserHandler {
    private List<User> users;

    public UserHandler(ArrayList<User> users){
        this.users = users;
    }

    public void addUser (User user){
        users.add(user);
    }

    public void sortUsers (){
        Collections.sort(users);
    }

    public void combineContacts(User donor, User recipient){
        boolean unique = true;

        for (Contact recipientContact: recipient.getContacts()) {
            for (Contact donorContact: donor.getContacts()) {
                if (donorContact.getClass() == recipientContact.getClass()){
                    unique = false;
                    if (!donorContact.getData().equals(recipientContact.getData())){
                        combineContact(donorContact.getData(), recipientContact.getData());
                    }
                }

                if (unique){
                    donor.getContacts().add(recipientContact);
                }
                unique = true;
            }
        }

        for (User user: users) {
            if (user.equals(recipient)){
                users.remove(user);
            }
        }
    }

    public void combineContact (ArrayList<String> donor, ArrayList<String> recipient){
        boolean unique = true;

        for (String recipientContact: recipient) {
            for (String donorContact: donor) {
                if (recipientContact.equals(donorContact)){unique = false;}
            }
            if (unique){
                donor.add(recipientContact);
            }
            unique = true;
        }
    }

    public ArrayList<User> searchByName (String stringForSearching){
        ArrayList<User> result = new ArrayList<>();

        for (User user: users) {
            if (!(user.getName().lastIndexOf(stringForSearching) == -1)){
                result.add(user);
            }
        }
        return result;
    }

    public ArrayList<User> searchByAllContacts (String stringForSearching){
        ArrayList<User> result = new ArrayList<>();
        boolean found = false;

        for (User user: users) {
            if (!(user.getName().lastIndexOf(stringForSearching) == -1) || !(user.getSurname().lastIndexOf(stringForSearching) == -1)){
                found = true;
            } else {
                for (Contact contact: user.getContacts()) {
                    for (String data:contact.getData()) {
                        if (!(data.lastIndexOf(stringForSearching) == -1)) {
                            found = true;
                        }
                    }
                }
            }

            if (found){result.add(user);}
            found = false;
        }
        return result;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }
}