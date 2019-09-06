package com.training.java.controller.command;

import com.training.java.model.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;

public class Registration implements Command {
    private static final Logger logger = LogManager.getLogger(Login.class);
    private UserService userService;

    public Registration(UserService userService) {
        this.userService = userService;
    }

    @Override
    public String execute(HttpServletRequest request) {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        if (email == null) return "/registration.jsp";
        try {
            userService.addUser(email, password);
            logger.info("User email " + email + " registrate successfully.");
        } catch (SQLException e) {
            request.setAttribute("error", true);
        }
        return "/registration.jsp";
    }
}
