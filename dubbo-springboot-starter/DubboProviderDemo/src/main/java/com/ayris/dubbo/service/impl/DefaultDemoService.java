package com.ayris.dubbo.service.impl;


import com.ayris.dubbo.service.DemoService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Value;

@DubboService(version = "1.0.0")
public class DefaultDemoService implements DemoService {

    @Value("${dubbo.application.name}")
    private String serviceName;

    public String sayHello(String name) {
        return String.format("[%s] : Hello, %s", serviceName, name);
    }
}
