package com.myself.controller;


import com.myself.dto.OrderDTO;
import com.myself.message.StreamClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by MySelf on 2018/10/29.
 */
@RestController
public class SendMessageController {

    @Autowired
    private StreamClient streamClient;

//    @GetMapping("/sendMessage")
//    public void process(){
//        String message = "now "+new Date();
//        streamClient.output().send(MessageBuilder.withPayload(message).build());
//    }

    @GetMapping("/sendMessage")
    public void process(){
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setOrderId("123456");
        streamClient.output().send(MessageBuilder.withPayload(orderDTO).build());
    }

}
