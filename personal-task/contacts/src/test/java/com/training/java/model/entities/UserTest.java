package com.training.java.model.entities;

import com.training.java.model.entities.contacts.Contact;
import com.training.java.model.entities.contacts.Mail;
import com.training.java.model.entities.contacts.Telephone;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class UserTest {
    User user;

    @Before
    public void start (){user = new User();}


    @Test
    public void setName() {
        String expected = "Dima";
        user.setName(expected);
        assertEquals(expected, user.getName());
    }

    @Test
    public void setSurname() {
        String expected = "Kamovich";
        user.setSurname(expected);
        assertEquals(expected, user.getSurname());
    }

    @Test
    public void setContacts() {
        ArrayList<Contact> contactsExpected =  new ArrayList<>();
        contactsExpected.add(new Telephone("+380654325643"));
        contactsExpected.add(new Mail("Test@mail"));
        user.setContacts(contactsExpected);
        assertEquals(contactsExpected, user.getContacts());
    }
}