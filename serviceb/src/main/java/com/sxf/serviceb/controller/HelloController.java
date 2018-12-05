package com.sxf.serviceb.controller;

import com.sxf.serviceb.provider.ServiceaProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private ServiceaProvider serviceaProvider;


    @GetMapping("hello")
    public String hello() {
        return "hello,i am service b";
    }

    @GetMapping("helloa")
//    @Hystrix(fallbackHandler = "helloaFallback")
    public String helloa(){
        return serviceaProvider.hello();
    }

//    public String helloaFallback() {
//        return
//    }

    @GetMapping("nihaoa")
    public String nihaoa() {
        return serviceaProvider.nihao();
    }


}
