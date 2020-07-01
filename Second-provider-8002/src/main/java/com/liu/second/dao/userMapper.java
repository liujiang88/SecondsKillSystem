package com.liu.second.dao;

import com.liu.second.entity.user;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface userMapper {
    user selectUserById(Integer id);
    int addUser(user user);
    int addListUser(List<user> list);
    boolean deleteUserById(Integer id);
    int updateUserById(user user);
}
