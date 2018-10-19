package com.myself.service;

import com.myself.ProductApplicationTests;
import com.myself.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by MySelf on 2018/10/19.
 */
@Component
public class CategoryServiceTest extends ProductApplicationTests{

    @Autowired
    private CategoryService categoryService;

    @Test
    public void findByCategoryTypeIn() throws Exception {
        List<ProductCategory> list =  categoryService.findByCategoryTypeIn(Arrays.asList(11,12));
        Assert.assertTrue(list.size() > 0);
    }

}