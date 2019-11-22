package com.example.ssmdemo.service;

import com.example.ssmdemo.dao.UserMapper;
import com.example.ssmdemo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userDao;
    public List<User> queryUser(){
        return userDao.query();
    }
}
