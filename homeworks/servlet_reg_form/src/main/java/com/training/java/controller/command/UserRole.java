package com.training.java.controller.command;

import com.training.java.model.entity.Role;

import javax.servlet.http.HttpServletRequest;

public class UserRole implements Command {
    @Override
    public String execute(HttpServletRequest request) {
        Role role = (Role) request.getSession().getAttribute("role");
        if (role.equals(Role.USER))
            return "/WEB-INF/user/userbasic.jsp";
        else return "redirect:/";
    }
}
