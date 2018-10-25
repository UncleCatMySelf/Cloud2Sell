package com.myself.service;

import com.myself.dataobject.ProductInfo;
import com.myself.dto.CartDTO;

import java.util.List;

/**
 * Created by MySelf on 2018/10/19.
 */
public interface ProductService {

    /**
     * 查询所有在架商品列表
     */
    List<ProductInfo> findUpAll();

    /**
     * 查询商品列表
     * @param productIdList
     * @return
     */
    List<ProductInfo> findList(List<String> productIdList);

    /**
     * 扣库存
     * @param cartDTOList
     */
    void decreaseStock(List<CartDTO> cartDTOList);
}
