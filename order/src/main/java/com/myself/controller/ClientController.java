package com.myself.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by MySelf on 2018/10/24.
 */
@Slf4j
@RestController
public class ClientController {

//    @Autowired
//    private LoadBalancerClient loadBalancerClient;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/getProductMsg")
    public String getProductMsg(){
        // 1、第一种方式（直接使用restTemplate，url写死）
//        RestTemplate restTemplate = new RestTemplate();
//        String response = restTemplate.getForObject("http://localhost:9082/msg",String.class);
//        log.info("response={}",response);

        //2、第二种方式（利用loadBalancerClient通过应用名获取url，然后再使用restTemplate）
//        ServiceInstance serviceInstance = loadBalancerClient.choose("PRODUCT");
//        String url = String.format("http://%s:%s",serviceInstance.getHost(),serviceInstance.getPort()) + "/msg";
//        RestTemplate restTemplate = new RestTemplate();
//        String response = restTemplate.getForObject(url,String.class);

        //3、第三种方式(利用@LoadBalanced，可再restTemplate里使用应用名字)
        String response = restTemplate.getForObject("http://PRODUCT/msg",String.class);

        log.info("response={}",response);
        return response;
    }

}
