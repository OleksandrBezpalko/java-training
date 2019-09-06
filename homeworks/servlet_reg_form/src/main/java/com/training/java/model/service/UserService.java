package com.training.java.model.service;


import com.training.java.model.dao.DaoFactory;
import com.training.java.model.dao.UserDao;
import com.training.java.model.entity.User;
import com.training.java.model.entity.Role;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class UserService {
    private DaoFactory daoFactory = DaoFactory.getInstance();
    private UserDao userDao = daoFactory.createUserDao();

    public List<User> findAllUsers(){
        return userDao.findAll();
    }

    public void addUser(String email, String password) throws SQLException {
        User newUser = User.builder()
                .email(email)
                .password(password)
                .role(Role.USER)
                .active(true)
                .build();
        userDao.add(newUser);
    }

    public Optional<User> findUser(String email, String password){
        Optional<User> user = Optional.ofNullable((userDao.findByEmail(email)));
        if (user.isPresent() && user.get().getPassword().equals(password)) {
            return user;
        }
        return Optional.empty();
    }
}
