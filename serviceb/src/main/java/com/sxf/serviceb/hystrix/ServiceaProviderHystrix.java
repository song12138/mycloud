package com.sxf.serviceb.hystrix;

import com.sxf.serviceb.provider.ServiceaProvider;
import org.springframework.stereotype.Component;

@Component
public class ServiceaProviderHystrix implements ServiceaProvider {

    @Override
    public String hello() {
        return "hello,servicea hava some issue";
    }

    @Override
    public String nihao() {
        return "你好，服务A出现一些小问题";
    }

}
