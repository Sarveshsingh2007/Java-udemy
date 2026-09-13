package com.sarvesh.SringEcom.Service;

import com.sarvesh.SringEcom.Model.Order;
import com.sarvesh.SringEcom.Model.dto.OrderRequest;
import com.sarvesh.SringEcom.Model.dto.OrderResponse;
import com.sarvesh.SringEcom.Repo.OrderRepo;
import com.sarvesh.SringEcom.Repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Service
public class OrderService {

    @Autowired
    private ProductRepo productRepo;
    private OrderRepo orderRepo;

    public OrderResponse placeOrder(OrderRequest orderRequest) {
        Order order = new Order();
        String orderId = UUID.randomUUID()
                .toString()
                .substring(0, 8)
                .toUpperCase();

        order.setOrderId(orderId);
        order.setCustomerName(orderRequest.customerName());
        order.setEmail(orderRequest.email());
        order.setStatus("Placed");
        order.setOrderDate(LocalDate.now());
        return orderRepo.findByOrderId(orderId);
    }

    public List<OrderResponse> getAllOrderResponses() {
        return null;
    }
}
