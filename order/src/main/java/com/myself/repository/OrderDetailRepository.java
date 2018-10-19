package com.myself.repository;

import com.myself.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by MySelf on 2018/10/19.
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail,String> {
}
