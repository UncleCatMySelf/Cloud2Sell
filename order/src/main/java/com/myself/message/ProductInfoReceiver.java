package com.myself.message;

import com.myself.dataobject.ProductInfo;
import com.myself.utils.JsonUtil;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by MySelf on 2018/10/29.
 */
@Component
public class ProductInfoReceiver {

    @RabbitListener(queuesToDeclare = @Queue("productInfo"))
    public void process(String message){
        //message => ProductInfoOutput(设定内外对接数据对象)
        ProductInfo productInfo = JsonUtil.fromJson(message,ProductInfo.class);
    }

}
