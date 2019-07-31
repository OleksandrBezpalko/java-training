package com.training.java.model;

import static com.training.java.model.TextConstants.ADDRESS_FORMAT;
import static com.training.java.model.TextConstants.USER_RECORD_TO_STRING_FORMAT;

public class UserRecord {
    private String nickname;
    private String name;
    private String surname;
    private String patronymic;
    private String comment;
    private String phoneNumber;
    private String email;
    private String postcode;
    private String city;
    private String street;
    private String houseNumber;
    private String apartmentNumber;

    public UserRecord() {

    }

    public UserRecord(String nickname, String name, String surname, String patronymic, String comment,
                      String phoneNumber, String email, String postcode, String city,
                      String street, String houseNumber, String apartmentNumber) {
        this.nickname = nickname;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.comment = comment;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.postcode = postcode;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.apartmentNumber = apartmentNumber;
    }

    @Override
    public String toString() {
        return  String.format(USER_RECORD_TO_STRING_FORMAT, surname,
                name, patronymic, nickname, comment, phoneNumber, email,
                houseNumber, apartmentNumber, street, city, postcode);
    }

    public String getAddress() {
        return String.format(ADDRESS_FORMAT,
                houseNumber, apartmentNumber, street, city, postcode);
    }

    public String getShortName() {
        return surname + " " + name.charAt(0) + ".";
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public void setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public String getNickname() {
        return nickname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getComment() {
        return comment;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getPostcode() {
        return postcode;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }
}
