package com.sxf.servicec.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service("servicea")
public class ServiceaImpl {
    @Autowired
    private RestTemplate restTemplate;

    public String hello() {
        return restTemplate.getForObject("http://servicea/hello", String.class);
    }
}
