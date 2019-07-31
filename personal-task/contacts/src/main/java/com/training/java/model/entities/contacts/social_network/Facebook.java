package com.training.java.model.entities.contacts.social_network;

import java.util.Objects;

public class Facebook extends SocialNetwork {

    public Facebook() {
    }

    public Facebook (String contactDate){
        super.socialNetworkName = SocialNetworkName.FACEBOOK;
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
        Facebook facebook = (Facebook) o;
        return data.equals(facebook.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }
}