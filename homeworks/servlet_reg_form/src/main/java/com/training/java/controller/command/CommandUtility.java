package com.training.java.controller.command;

import com.training.java.model.entity.Role;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashSet;

class CommandUtility {
    static void setUserRole(HttpServletRequest request, Role role, String email) {
        HttpSession session = request.getSession();
        session.setAttribute("userEmail", email);
        session.setAttribute("role", role);
    }

    static boolean checkUserIsLogged(HttpServletRequest request, String email) {
        @SuppressWarnings("unchecked")
        HashSet<String> loggedUsers = (HashSet<String>) request.getSession()
                .getServletContext().getAttribute("loggedUsers");
        if (loggedUsers == null) return false;
        if (loggedUsers.stream().anyMatch(email::equalsIgnoreCase)) return true;
        loggedUsers.add(email);
        request.getSession().getServletContext().setAttribute("loggedUsers", loggedUsers);
        return false;
    }

//    static void deleteUserFromContextAndSession(HttpServletRequest request) {
//        HttpSession session = request.getSession();
//        ServletContext context = request.getServletContext();
//        String email = (String) context.getAttribute("userEmail");
//        @SuppressWarnings("unchecked")
//        HashSet<String> loggedUsers = (HashSet<String>) request.getSession()
//                .getServletContext().getAttribute("loggedUsers");
//        loggedUsers.remove(email);
//        request.getSession().getServletContext().setAttribute("loggedUsers", loggedUsers);
//        setUserRole(request, Role.GUEST, "Guest");
//    }
}
