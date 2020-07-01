package com.liu.second.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Component
@FeignClient(value = "SPRINGCLOUD-PROVIDER-DEPT",fallbackFactory =userCilentServiceFallback.class )
public interface FeignuserCilentService {
    @RequestMapping(value = "/select?id={id}",method = RequestMethod.POST)
    String selectById(@PathVariable("id") Long id);
}
