package com.training.java.model.entities.contacts;

import java.util.ArrayList;

public abstract class Contact {
    protected ArrayList<String> data = new ArrayList<String>();

    public ArrayList<String> getData() {
        return data;
    }

    public abstract void addContactData (String contactDate);
    public abstract void removeContactData (String contactDate);
}