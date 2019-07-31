package com.training.java.model;

import java.util.ArrayList;

public class RecordsBase {
    private ArrayList<UserRecord> list;

    public RecordsBase() {
        list = new ArrayList<>();
    }

    public void addRecord(UserRecord recordToAdd) throws NotUniqueNicknameException {
        String nickname = recordToAdd.getNickname();
        for (UserRecord record : list) {
            if (nickname.equals(record.getNickname())) {
                throw new NotUniqueNicknameException(nickname);
            }
        }
        list.add(recordToAdd);
    }
}
