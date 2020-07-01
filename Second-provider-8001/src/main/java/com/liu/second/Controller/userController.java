package com.liu.second.Controller;



import com.google.common.util.concurrent.RateLimiter;
import com.liu.second.entity.user;
import com.liu.second.service.imp.userServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.TimeUnit;

@CrossOrigin("*")
@RestController
public class userController {
     @Autowired
     userServiceImpl userm;


     private RateLimiter rateLimiter=RateLimiter.create(10);

     @GetMapping("/sale")
     public String sale(Integer id) throws InterruptedException {
         /**
          * 一直等待  rateLimiter.acquire()
          */
         if (!rateLimiter.tryAcquire(5, TimeUnit.SECONDS)) {
             System.out.println("失败");
             Thread.sleep(200);
         }
         System.out.println("成功");
         return "成功";
     }


    @RequestMapping("/select")
    public String selectUserById(Integer id) {
        System.out.println("-----------------------------"+id);
        user yuser = userm.selectUserById(id);
        return yuser.toString();
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
