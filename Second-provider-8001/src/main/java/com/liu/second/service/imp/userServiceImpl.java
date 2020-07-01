package com.liu.second.service.imp;

import com.liu.second.dao.userMapper;
import com.liu.second.entity.user;
import com.liu.second.service.IuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class userServiceImpl implements IuserService {
   @Autowired
   userMapper userm;


   public user selectUserById(Integer id) {


      return userm.selectUserById(id);
   }

   public int addUser(user user) {
      return userm.addUser(user);
   }

   public int addListUser(List<user> list) {
      return userm.addListUser(list);
   }

   public boolean deleteUserById(Integer id) {
      return userm.deleteUserById(id);
   }

   public int updateUserById(user user) {
      return userm.updateUserById(user);
   }
}
