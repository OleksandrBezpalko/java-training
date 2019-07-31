package com.training.java.model.entities.contacts.social_network;

import com.training.java.model.entities.contacts.Contact;

public abstract class SocialNetwork extends Contact {
   protected SocialNetworkName socialNetworkName;

    public SocialNetworkName getSocialNetworkName() {
        return socialNetworkName;
    }
}
