package com.myself.controller;

import com.myself.dataobject.ProductCategory;
import com.myself.dataobject.ProductInfo;
import com.myself.service.CategoryService;
import com.myself.service.ProductService;
import com.myself.utils.ResultVOUtil;
import com.myself.vo.ProductInfoVO;
import com.myself.vo.ProductVo;
import com.myself.vo.ResultVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 商品
 * Created by MySelf on 2018/10/19.
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private CategoryService categoryService;

    /**
     * 1、查询所有在架的商品
     * 2、获取类目type列表
     * 3、查询数目
     * 4、构造数据
     */
    @GetMapping("/list")
    public ResultVO<ProductVo> list(){
        //1、查询所有在架的商品
        List<ProductInfo> productInfoList = productService.findUpAll();
        //2、获取类目type列表
        List<Integer> categoryTypeList = productInfoList.stream().map(ProductInfo::getCategoryType)
                .collect(Collectors.toList());Collectors.toList();
        //3、查询数目
        List<ProductCategory> categoryList = categoryService.findByCategoryTypeIn(categoryTypeList);
        //4、构造数据
        List<ProductVo> productVoList = new ArrayList<>();
        for (ProductCategory productCategory:categoryList){
            ProductVo productVo = new ProductVo();
            productVo.setCategoryName(productCategory.getCategoryName());
            productVo.setCategoryType(productCategory.getCategoryType());

            List<ProductInfoVO> productInfoVOList = new ArrayList<>();
            for (ProductInfo productInfo:productInfoList){
                if (productInfo.getCategoryType().equals(productCategory.getCategoryType())){
                    ProductInfoVO productInfoVO = new ProductInfoVO();
                    BeanUtils.copyProperties(productInfo,productInfoVO);
                    productInfoVOList.add(productInfoVO);
                }
            }
            productVo.setProductInfoVOList(productInfoVOList);
            productVoList.add(productVo);
        }

        return ResultVOUtil.success(productVoList);
    }

}
