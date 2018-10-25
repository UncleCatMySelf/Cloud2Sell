package com.myself.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by MySelf on 2018/10/25.
 */
@Component
@FeignClient(name = "product")
public interface ProductClient {

    @GetMapping("/msg")
    String productMsg();

}
