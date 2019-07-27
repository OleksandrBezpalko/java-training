package com.training.notebook.controller;

public interface RegexContainer {

    String REGEX_NAME_EN = "^[A-Z][a-z]{1,20}$";

    String REGEX_LOGIN = "^[A-Za-z0-9_-]{8,20}$";

    String REGEX_COMMENT_EN = "([A-Za-z,.\\\\s]+)";

    String REGEX_PHONE_NUMBER = "^[+][3][8][0][0-9]{9}";
    String REGEX_PHONE_NUMBER_OPTIONAL = "([n][o])|(^[+][3][8][0][0-9]{9})";

    String REGEX_EMAIL = "^[a-zA-Z0-9_!#$%&?*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
    String REGEX_SKYPE = "^[a-zA-Z][a-zA-Z0-9_.,-]{5,31}$";

    String REGEX_INDEX = "[0-9]{5}";
    String REGEX_CITY_EN = "^[a-zA-Z]+(?:[\\s-][a-zA-Z]+)*$";
    String REGEX_STREET_EN = "^[a-zA-Z]+(?:[\\s-][a-zA-Z]+)*$";
    String REGEX_HOUSE_NUMBER_EN = "^\\d+[a-zA-Z]*$";
    String REGEX_APARTMENT_NUMBER_EN = "^\\d+[a-zA-Z]*$";

    String REGEX_NAME_UA = "^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']{1,20}$";
    String REGEX_COMMENT_UA = "^\\\\d+/?\\\\d*[А-ЩЬЮЯҐІЇЄа-щьюяґіїє'/]?(?<!/)${0,100}$";
    String REGEX_CITY_UA = "^[А-ЩЬЮЯҐІЇЄа-щьюяґіїє']{1,20}";
    String REGEX_STREET_UA = "^\\d+\\s[А-ЩЬЮЯҐІЇЄа-щьюяґіїє']+\\s[А-ЩЬЮЯҐІЇЄа-щьюяґіїє']+{1,20}$";
    String REGEX_HOUSE_NUMBER_UA = "^\\d+[А-ЩЬЮЯҐІЇЄа-щьюяґіїє'/]*$";
    String REGEX_APARTMENT_NUMBER_UA = "^\\d+[А-ЩЬЮЯҐІЇЄа-щьюяґіїє'/]*$";
}

