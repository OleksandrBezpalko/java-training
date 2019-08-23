package com.training.java.model.entity;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class DBNoteBook {


    public static List<String> findLogin(Statement query) throws Exception {
        ResultSet rs = query.executeQuery("SELECT * FROM note");
        List<String> list = new LinkedList<>();
        while (rs.next()) {
            list.add(rs.getString("login"));
        }
        return list;
    }

    public static  boolean checkLogin(String loginData,Statement query) {
        try {
            List<String> values = findLogin(query);
            for (String login : values) {
                if (login.equals(loginData)) {
                    return true;
                }
            }

        } catch (Exception e) {
        }
        return false;
    }
}
