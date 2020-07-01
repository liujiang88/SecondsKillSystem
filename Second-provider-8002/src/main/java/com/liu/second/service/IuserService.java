package com.liu.second.service;

import com.liu.second.entity.user;

import java.util.List;

public interface IuserService {
    user selectUserById(Integer id);
    int addUser(user user);
    int addListUser(List<user> list);
    boolean deleteUserById(Integer id);
    int updateUserById(user user);
}
