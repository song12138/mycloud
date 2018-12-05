package com.sxf.serviceb.provider;

import com.sxf.serviceb.hystrix.ServiceaProviderHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "servicea",fallback = ServiceaProviderHystrix.class)
public interface ServiceaProvider {
    @GetMapping("hello")
    String hello();

    @GetMapping("nihao")
    String nihao();

}
