package com.myself.service.impl;

import com.myself.dataobject.ProductInfo;
import com.myself.enums.ProductStatusEnum;
import com.myself.repository.ProductInfoRepository;
import com.myself.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by MySelf on 2018/10/19.
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Override
    public List<ProductInfo> findUpAll() {
        return productInfoRepository.findByProductStatus(ProductStatusEnum.UP.getCode());
    }
}
