package com.training.java.model;

import com.training.java.model.database.DatabaseAccessObject;
import com.training.java.model.entities.User;
import com.training.java.model.servicies.UserHendler;

import java.util.ArrayList;

public class Model {
    public User user = new User();
    private DatabaseAccessObject databaseAccessObject = new DatabaseAccessObject();
    private UserHendler userHendler = new UserHendler(databaseAccessObject.readFromDatabase());

    public Model(){
    }

    public void addUser (User user){
        userHendler.addUser(user);
        updateDatabase();
    }

    public void createNewUser (){
        this.user = new User();
    }

    public void sortUsers (){
        userHendler.sortUsers();
    }

    public void combineContacts(User donor, User recipient){
        userHendler.combineContacts(donor,recipient);
    }

    public ArrayList<User> searchByName (String stringForSearching){
        return userHendler.searchByName(stringForSearching);
    }

    public ArrayList<User> searchByAllContacts (String stringForSearching){
        return userHendler.searchByAllContacts(stringForSearching);
    }

    public void updateDatabase (){
        databaseAccessObject.writeToDatabase(userHendler.getUsers());
    }

    public ArrayList<User> getUsers (){
        return userHendler.getUsers();
    }
}
