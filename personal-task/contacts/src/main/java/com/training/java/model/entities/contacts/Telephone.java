package com.training.java.model.entities.contacts;

import java.util.Objects;

public class Telephone extends Contact {

    public Telephone() {
    }

    public Telephone (String contactData){
        this.addContactData(contactData);
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
        Telephone telephone = (Telephone) o;
        return data.equals(telephone.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }
}
