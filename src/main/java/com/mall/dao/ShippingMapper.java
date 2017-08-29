package com.mall.dao;

import com.mall.pojo.Shipping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface ShippingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Shipping record);

    int insertSelective(Shipping record);

    Shipping selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Shipping record);

    int updateByPrimaryKey(Shipping record);

    int deleteByShippingIdUserId(@RequestParam("userId") Integer userId, @RequestParam("shippingId") Integer shippingId);

    int updateByShipping(Shipping record);

    Shipping selectByShippingIdUserId(@RequestParam("userId") Integer userId, @RequestParam("shippingId") Integer shippingId);

    List<Shipping> selectByUserId(Integer userId);
}