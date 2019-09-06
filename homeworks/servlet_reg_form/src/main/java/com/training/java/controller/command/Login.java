package com.training.java.controller.command;

import com.training.java.model.entity.Role;
import com.training.java.model.entity.User;
import com.training.java.model.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.http.HttpServletRequest;

import java.util.Optional;

import static java.util.Objects.nonNull;

public class Login implements Command {
    private static final Logger logger = LogManager.getLogger(Login.class);
    private UserService userService;

    public Login(UserService userService) {
        this.userService = userService;
    }


    @Override
    public String execute(HttpServletRequest request) {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        if (email == null) return "/login.jsp";
        System.out.println("user enter email: "+ email + " " + password);

        System.out.println("entering DB : ");
        userService.findAllUsers().forEach(System.out::println);

        if (nonNull(request.getSession().getAttribute("userEmail"))) return "/welcome.jsp";
        Optional<User> user = userService.findUser(email, password);
        if (!user.isPresent()) {
            logger.info("Invalid attempt of user email: '" + email + "'");
             request.setAttribute("error", true);
            return "/login.jsp";
        }
        if (CommandUtility.checkUserIsLogged(request, email)) {
            logger.info("User email " + email + " already logged.");
            throw new RuntimeException("You already logged");
        }
        logger.info("User email " + email + " logged successfully.");

        if (user.get().getRole().equals(Role.ADMIN)) {
            CommandUtility.setUserRole(request, Role.ADMIN, email);
            return "redirect:/restaurant/admin";
        } else if (user.get().getRole().equals(Role.USER)) {
            CommandUtility.setUserRole(request, Role.USER, email);
            return "/WEB-INF/user/userbasic.jsp";
        } else {
            return "redirect:/index.jsp";
        }
    }
}