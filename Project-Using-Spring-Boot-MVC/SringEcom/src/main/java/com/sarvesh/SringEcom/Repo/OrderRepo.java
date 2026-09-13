package com.sarvesh.SringEcom.Repo;

import com.sarvesh.SringEcom.Model.Order;
import com.sarvesh.SringEcom.Model.dto.OrderResponse;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OrderRepo extends JpaRepository<Order, Integer> {
    OrderResponse findByOrderId(String orderId);
}
