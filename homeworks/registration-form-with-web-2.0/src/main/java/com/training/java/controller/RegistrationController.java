package com.training.java.controller;


import com.training.java.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import com.training.java.entity.Role;
import com.training.java.entity.User;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@Slf4j
@Controller
public class RegistrationController {
    @Autowired
    private UserService uS;

    @PostMapping("/registration")
    public String addUser(User user, Model model) {
        user.setActive(true);
        user.setRoles(Collections.singleton(Role.USER));
        log.info("{}",user);
        try {
            uS.saveNewUser(user);
        } catch (DataIntegrityViolationException e) {
            Map<String, String> map = new HashMap<>();
            map.put("spring", "mvc");
            model.addAttribute("message", "user already exists");
            model.mergeAttributes(map);
            log.info("{Почтовый адрес уже существует}");
            return "register.html";
        }
        return "redirect:/login";
    }
}