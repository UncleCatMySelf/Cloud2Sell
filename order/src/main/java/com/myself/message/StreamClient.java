package com.myself.message;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * Created by MySelf on 2018/10/29.
 */
public interface StreamClient {

    String  MESSAGE = "myMessage";

//    @Input(StreamClient.MESSAGE)  //类似@Bean
//    SubscribableChannel input();

    @Output(StreamClient.MESSAGE)
    MessageChannel output();

}
