package com.myself.dto;

import lombok.Data;

/**
 * Created by MySelf on 2018/10/25.
 */
@Data
public class CartDTO {

    /**
     * 商品Id
     */
    private String productId;

    /**
     * 商品数量
     */
    private Integer productQuantity;

    public CartDTO(){}

    public CartDTO(String productId,Integer productQuantity){
        this.productId = productId;
        this.productQuantity = productQuantity;
    }

}
