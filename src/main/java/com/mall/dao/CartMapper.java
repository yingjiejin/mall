package com.mall.dao;

import com.mall.pojo.Cart;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface CartMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cart record);

    int insertSelective(Cart record);

    Cart selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cart record);

    int updateByPrimaryKey(Cart record);

    Cart selectCartByUserIdProductId(@RequestParam("userId") Integer userId, @RequestParam("productId") Integer productId);

    List<Cart> selectCartByUserId(Integer userId);

    int selectCartProductCheckedStatusByUserId(Integer userId);

    int deleteByUserIdProductIds(@RequestParam("userId") Integer userId, @RequestParam("productIdList") List<String> productIdList);

    int checkedOrUnCheckedAllProduct(@RequestParam("userId") Integer userId, @RequestParam("checked") Integer checked);

}