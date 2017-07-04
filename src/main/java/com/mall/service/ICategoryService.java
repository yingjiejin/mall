package com.mall.service;

import com.mall.common.ServerResponse;

/**
 * Created by Administrator on 2017/7/4.
 */
public interface ICategoryService {

    ServerResponse addCategory(String categoryName, Integer parentId);
}
