package com.sarvesh.SringEcom.Controller;

import com.sarvesh.SringEcom.Model.OrderItem;
import com.sarvesh.SringEcom.Model.dto.OrderRequest;
import com.sarvesh.SringEcom.Model.dto.OrderResponse;
import com.sarvesh.SringEcom.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class OrderController {
    @Autowired
    private OrderService orderService;
    @PostMapping("orders/place")
    public ResponseEntity<OrderResponse> placeOrder(@RequestBody OrderRequest orderRequest){
        OrderResponse orderResponse = orderService.placeOrder(orderRequest);
        return new ResponseEntity<>(orderResponse, HttpStatus.CREATED);
    }

    @GetMapping("/orders")
    public ResponseEntity<List<OrderResponse>> getAllOrders(){
        List<OrderResponse> reponses = orderService.getAllOrderResponses();
        return new ResponseEntity<>(reponses, HttpStatus.OK);
    }
}
