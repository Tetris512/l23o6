package org.fffd.l23o6.dao;

import java.util.List;

import org.aspectj.weaver.ast.Or;
import org.fffd.l23o6.pojo.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDao extends JpaRepository<OrderEntity, Long>{
    List<OrderEntity> findByUserId(Long userId);

    List<OrderEntity> findByArrivalStationId(Long dsvsdvsd);

    List<OrderEntity> findAllById(Long iddddd);
}
