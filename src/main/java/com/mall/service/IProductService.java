package com.mall.service;

import com.mall.common.ServerResponse;
import com.mall.pojo.Product;

/**
 * @Author: jin
 * @Version: 2017/7/6
 */
public interface IProductService {

    ServerResponse saveOrUpdateProduct(Product product);

    ServerResponse<String> setSaleStatus(Integer productId, Integer status);
}
