package com.github.springbootvue.service.impl;

import com.github.springbootvue.dao.UserMapper;
import com.github.springbootvue.entity.User;
import com.github.springbootvue.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper mapper;

    @Override
    public User selectByUsername(String username) {
        return mapper.selectByUsername(username);
    }

}
