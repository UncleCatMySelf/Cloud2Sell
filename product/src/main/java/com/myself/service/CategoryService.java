package com.myself.service;

import com.myself.dataobject.ProductCategory;

import java.util.List;

/**
 * 类目
 * Created by MySelf on 2018/10/19.
 */
public interface CategoryService {

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

}
