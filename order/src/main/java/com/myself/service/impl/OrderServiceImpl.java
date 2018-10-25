package com.myself.service.impl;

import com.myself.dataobject.OrderMaster;
import com.myself.dto.OrderDTO;
import com.myself.enums.OrderStatusEnum;
import com.myself.enums.PayStatusEnum;
import com.myself.repository.OrderDetailRepository;
import com.myself.repository.OrderMasterRepository;
import com.myself.service.OrderService;
import com.myself.utils.KeyUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * Created by MySelf on 2018/10/24.
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @Autowired
    private OrderMasterRepository orderMasterRepository;

    @Override
    public OrderDTO create(OrderDTO orderDTO) {

//      TODO 2、查询商品信息（调用商品服务）

//      TODO 3、计算总价
//      TODO 4、扣库存（调用商品服务）
//       5、订单入库
        OrderMaster orderMaster = new OrderMaster();
        orderDTO.setOrderId(KeyUtil.genUniqueKey());
        BeanUtils.copyProperties(orderDTO,orderMaster);
        orderMaster.setOrderAmount(new BigDecimal(5));
        orderMaster.setOrderStatus(OrderStatusEnum.NEW.getCode());
        orderMaster.setPayStatus(PayStatusEnum.WAIT.getCode());

        orderMasterRepository.save(orderMaster);
        return null;
    }
}
