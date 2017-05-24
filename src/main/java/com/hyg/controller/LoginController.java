package com.hyg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class LoginController
{
    @RequestMapping("/login")
    public String Login(HttpServletRequest request , HttpServletResponse response) {
        String userName = request.getParameter("userName");
        String userPassword = request.getParameter("userPassword");
        if(userName != "" && userPassword != ""){
            request.setAttribute("name",userName);
            request.setAttribute("password",userPassword);

            return "register/register";
        }

        return "login/login";
    }
}
