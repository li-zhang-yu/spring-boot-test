package com.github.springbootvue.service;

import com.github.springbootvue.entity.User;

public interface UserService {

    public User selectByUsername(String username);

}
