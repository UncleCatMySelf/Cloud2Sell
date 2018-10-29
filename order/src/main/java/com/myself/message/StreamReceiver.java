package com.myself.message;

import com.myself.dto.OrderDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

/**
 * Created by MySelf on 2018/10/29.
 */
@Slf4j
@Component
@EnableBinding(StreamClient.class)
public class StreamReceiver {

//    @StreamListener(value = StreamClient.MESSAGE)
//    public void process(Object message){
//        log.info("StreamReceiver:{}",message);
//    }

    /**
     * 接收orderDTO对象  消息
     * @param message
     */
    @StreamListener(value = StreamClient.MESSAGE)
    public void process(OrderDTO message){
        log.info("StreamReceiver:{}",message);
    }

}
