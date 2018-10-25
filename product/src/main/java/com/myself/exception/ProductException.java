package com.myself.exception;

import com.myself.enums.ResultEnum;

/**
 * Created by MySelf on 2018/10/25.
 */
public class ProductException extends RuntimeException {

    private Integer code;

    public ProductException(Integer code,String message){
        super(message);
        this.code = code;
    }

    public ProductException(ResultEnum resultEnum){
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

}
