package com.sarvesh.SringEcom.Repo;

import com.sarvesh.SringEcom.Model.Order;
import com.sarvesh.SringEcom.Model.dto.OrderResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OrderRepo extends JpaRepository<Order, Integer> {
    Optional<Order> findByOrderId(String orderId);
}
