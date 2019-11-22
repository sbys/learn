package com.example.ssmdemo.dao;

import com.example.ssmdemo.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    List<User> query();
}
