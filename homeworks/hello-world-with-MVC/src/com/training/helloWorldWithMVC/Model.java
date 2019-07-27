package com.training.helloWorldWithMVC;

public class Model {
    private static final String FIRST_KEY_WORD = "Hello";
    private static final String SECOND_KEY_WORD = "world!";

    /**
     * checks the entered value and keyword
     * @param inputWord - entered value
     * @param keyWord - keyword
     * @return true or false
     */

    public boolean checkKeyWord (String inputWord, String keyWord){

        if (inputWord.equals(keyWord)){ return true;}
        else{ return  false;}
    }

    public boolean checkTheCondition(String word1, String word2) {
        if (checkKeyWord(word1, FIRST_KEY_WORD)){
            if (checkKeyWord(word2, SECOND_KEY_WORD)){
                return true;
            }
        }
        return false;
    }

    public static String getFirstKeyWord() {
        return FIRST_KEY_WORD;
    }

    public static String getSecondKeyWord() {
        return SECOND_KEY_WORD;
    }
}