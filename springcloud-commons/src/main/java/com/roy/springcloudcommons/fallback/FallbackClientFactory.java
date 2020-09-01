package com.roy.springcloudcommons.fallback;

import com.roy.springcloudcommons.service.UserService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class FallbackClientFactory implements FallbackFactory<UserService> {
    @Override
    public UserService create(Throwable throwable) {
        return new UserService() {
            @Override
            public int addition(int n1, int n2) {
                System.out.println("加法降级");
                return -1;
            }

            @Override
            public int subtraction(int n1, int n2) {
                System.out.println("减法降级");
                return -1;
            }
        };
    }
}
