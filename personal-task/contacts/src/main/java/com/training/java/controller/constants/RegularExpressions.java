package com.training.java.controller.constants;

public interface RegularExpressions {
    String REGEX_NAME_EN = "^[A-Z][a-z]{1,20}$";
    String REGEX_SURNAME_EN = "^[A-Z][a-z]{1,20}$";
    String REGEX_SEARCH_EN = "[A-Za-z0-9]{1,20}$";

    String REGEX_NAME_UA = "^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']{1,20}$";
    String REGEX_SURNAME_UA = "^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']{1,20}$";
    String REGEX_SEARCH_UA = "[А-ЩЬЮЯҐІЇЄа-щьюяґіїє0-9A-Za-z0-9]{1,20}$";

    String REGEX_SOCIAL_NETWORK = "^[A-Za-z0-9_-]{8,20}$";
    String REGEX_PHONE_NUMBER = "^[+][3][8][0][0-9]{9}";
    String REGEX_EMAIL = "^[a-zA-Z0-9_!#$%&?*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
    String REGEX_SKYPE = "^[a-zA-Z][a-zA-Z0-9_.,-]{5,31}$";
}
