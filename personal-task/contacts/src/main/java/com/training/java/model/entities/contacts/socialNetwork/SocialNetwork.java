package com.training.java.model.entities.contacts.socialNetwork;

import com.training.java.model.entities.contacts.Contact;

public abstract class SocialNetwork extends Contact {
   protected SocialNetworkName socialNetworkName;

    public SocialNetworkName getSocialNetworkName() {
        return socialNetworkName;
    }
}
