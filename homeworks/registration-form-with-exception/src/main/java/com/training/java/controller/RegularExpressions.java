package com.training.java.controller;

public interface RegularExpressions {
    String REGEX_NAME = "[А-Я][a-я]+";
    String REGEX_SURNAME = "[А-Я][а-я]+(-[А-Я][а-я]+)*";
    String REGEX_PATRONYMIC = "[А-Я][a-я]+в((ич)|(на))";
    String REGEX_NICKNAME = "[a-zA-Z0-9_]+";
    String REGEX_COMMENT = ".+";
    String REGEX_PHONE_NUMBER = "(\\+38)?0[0-9]{9}";
    String REGEX_EMAIL = "[\\.\\-_a-zA-Z0-9]+@[a-z]+\\.[a-z]+";
    String REGEX_POSTCODE = "[0-9]{5}";
    String REGEX_CITY = "[А-Я]((( [А-Я])|(-[А-Я]))?[а-я]*)+";
    String REGEX_STREET = "[А-Я]((( [А-Я])|(-[А-Я]))?[а-я]*)+";
    String REGEX_HOUSE_NUMBER = "[0-9]+[А-Я]?";
    String REGEX_APARTMENT_NUMBER = "[0-9]+";
}
