package com.sxf.servicea.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("hello")
    public String hello() {
        return "hello,i am service a  2";
    }

    @GetMapping("nihao")
    public String nihao() {
        return "你好，我是服务A  2";
    }

}
