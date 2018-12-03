package com.cj.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;


@Service(interfaceClass = ProviderService.class)
@Component
public class ProviderServiceImpl implements  ProviderService {

    @Override
    public String sayDubbo() {
        return "just use dubbo demo!";
    }
}
