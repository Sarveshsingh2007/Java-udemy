package com.sarvesh.SringEcom.Model.dto;

import java.math.BigDecimal;

public record OrderItemResponse(
        String productId,
        int quantity,
        BigDecimal totalPrice
) {
}
