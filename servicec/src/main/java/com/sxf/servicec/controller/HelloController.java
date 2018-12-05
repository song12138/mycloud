package com.sxf.servicec.controller;

import com.sxf.servicec.service.ServiceaImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private ServiceaImpl servicea;

    @GetMapping("helloa")
    public String hello() {
        return servicea.hello();
    }


}
