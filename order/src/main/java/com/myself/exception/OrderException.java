package com.myself.exception;

import com.myself.enums.ResultEnum;

/**
 * Created by MySelf on 2018/10/24.
 */
public class OrderException extends RuntimeException{

    private Integer code;

    public OrderException(Integer code,String message){
        super(message);
        this.code = code;
    }

    public OrderException(ResultEnum resultEnum){
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

}
