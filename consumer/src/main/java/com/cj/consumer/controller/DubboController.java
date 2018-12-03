package com.cj.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cj.provider.service.ProviderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/duboo")
public class DubboController {

    @Reference
    private ProviderService providerServiceImpl;

    @GetMapping("/test")
    public String hello(){
        return providerServiceImpl.sayDubbo();

    }
}
