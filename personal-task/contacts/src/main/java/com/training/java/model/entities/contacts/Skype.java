package com.training.java.model.entities.contacts;

import java.util.Objects;

public class Skype extends Contact {

    public Skype() {
    }

    public Skype (String contactDate){
        this.addContactData(contactDate);
    }

    public void addContactData(String contactData) {
        data.add(contactData);
    }

    public void removeContactData(String contactData) {
        for (String telephone: data) {
            if (telephone.equals(contactData)) {
                data.remove(contactData);
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Skype skype = (Skype) o;
        return data.equals(skype.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }
}