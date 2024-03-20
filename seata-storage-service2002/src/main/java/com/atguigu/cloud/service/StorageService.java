package com.atguigu.cloud.service;

/**
 * @author weihanqiang
 * @date 2024/3/19
 */
public interface StorageService {
    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}
