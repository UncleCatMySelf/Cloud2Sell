package com.myself.repository;

import com.myself.dataobject.OrderMaster;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by MySelf on 2018/10/19.
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster,String> {
}
