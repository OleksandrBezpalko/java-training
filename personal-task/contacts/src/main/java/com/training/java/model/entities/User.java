package com.training.java.model.entities;

import com.training.java.model.entities.contacts.Contact;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class User implements Comparable<User>{
    private String name;
    private String surname;
    private List<Contact> contacts = new ArrayList<Contact>();

    public User (){
    }

    public User (String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public void addContact (Contact contact){
        contacts.add(contact);
    }

    public void addContact (Contact ...contactData){
        Collections.addAll(contacts, contactData);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setContacts(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }

    public int compareTo(User other) {
        if (!name.equals(other.name)){
            return name.compareTo(other.name);
        } else { return surname.compareTo(other.surname); }
    }
}
