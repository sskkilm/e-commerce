package com.example.product.domain;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder
public class HoldingStock {
    private Long id;
    private Long orderId;
    private Long productId;
    private int quantity;
    LocalDateTime createdAt;

    public static HoldingStock create(Long orderId, Long productId, int quantity) {
        return HoldingStock.builder()
                .orderId(orderId)
                .productId(productId)
                .quantity(quantity)
                .build();
    }
}
