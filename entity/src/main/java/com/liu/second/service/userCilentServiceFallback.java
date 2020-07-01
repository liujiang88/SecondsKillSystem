package com.liu.second.service;

import com.liu.second.entity.user;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class userCilentServiceFallback implements FallbackFactory {

    public Object create(Throwable throwable) {
        return new FeignuserCilentService() {
            public String selectById(Long id) {
                  return new user().setUserName("服务调用失败").setPassword("over").toString();
            }
        };
    }
}
