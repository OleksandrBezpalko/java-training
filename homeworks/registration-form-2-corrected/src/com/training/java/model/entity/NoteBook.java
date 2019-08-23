package com.training.java.model.entity;

import java.sql.Statement;

public class NoteBook {
    private String firstName;
    private String loginData;

    public NoteBook(String firstName, String loginData, Statement query)
                            throws NotUniqueLoginException{
        if (DBNoteBook.checkLogin(loginData,query)){
                throw new NotUniqueLoginException("Not Unique Login",
                        loginData);
        }
        this.firstName = firstName;
        this.loginData = loginData;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLoginData() {
        return loginData;
    }
    public void setLoginData(String loginData) {
        this.loginData = loginData;
    }

    @Override
    public String toString() {
        return "NoteBook{" +
                "firstName='" + firstName + '\'' +
                ", loginData='" + loginData + '\'' +
                '}';
    }
}
