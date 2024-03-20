package com.atguigu.cloud.service;

import com.atguigu.cloud.entities.Order;

/**
 * @author weihanqiang
 * @date 2024/3/19
 */
public interface OrderService {

    /**
     * 创建订单
     */
    void  create(Order order);

}
