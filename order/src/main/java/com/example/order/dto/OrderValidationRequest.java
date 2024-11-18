package com.example.order.dto;

import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.List;

public record OrderValidationRequest(
        @NotNull Long orderId,
        @NotNull List<Long> orderProductIds,
        @NotNull BigDecimal amount
) {
}
