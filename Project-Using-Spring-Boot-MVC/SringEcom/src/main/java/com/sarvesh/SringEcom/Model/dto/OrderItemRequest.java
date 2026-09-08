package com.sarvesh.SringEcom.Model.dto;

public record OrderItemRequest(
        int productId,
        int quantity
) {
}
