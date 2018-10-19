package com.myself.service;

import com.myself.dataobject.ProductInfo;

import java.util.List;

/**
 * Created by MySelf on 2018/10/19.
 */
public interface ProductService {

    /**
     * 查询所有在架商品列表
     */
    List<ProductInfo> findUpAll();

}
