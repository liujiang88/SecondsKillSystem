package com.liu.second.controller;


import com.liu.second.service.FeignuserCilentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserControllesFeign {
    @Autowired
    FeignuserCilentService feignuserCilentService;

    @RequestMapping("/selectById")
    public String getUserById(Long id){
        System.out.println(id);
        return  feignuserCilentService.selectById(id);
    }

}
