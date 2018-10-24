package com.myself.service;

import com.myself.dto.OrderDTO;

/**
 * Created by MySelf on 2018/10/24.
 */
public interface OrderService {

    /**
     * 创建订单
     * @param orderDTO
     * @return
     */
    OrderDTO create(OrderDTO orderDTO);

}
