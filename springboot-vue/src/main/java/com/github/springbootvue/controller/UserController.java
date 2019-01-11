package com.github.springbootvue.controller;

import com.github.springbootvue.entity.User;
import com.github.springbootvue.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public User login(HttpServletRequest request){
        System.out.println(123);
        System.out.println(request.getParameterMap().entrySet().toString());
        String username = request.getParameter("username");
        System.out.println(username);
        String password = request.getParameter("password");
        System.out.println(password);
        return  userService.selectByUsername(username);
    }

}
