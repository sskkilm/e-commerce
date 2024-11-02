package com.example.product.domain;

import com.example.product.exception.InsufficientStockException;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@SuperBuilder
public abstract class Product {
    private Long id;
    private String name;
    private BigDecimal price;
    private int stockQuantity;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public void decreaseStock(int quantity) {
        if (stockQuantity < quantity) {
            throw new InsufficientStockException(
                    "상품 재고가 부족합니다. 남은 재고 수량: " + stockQuantity
            );
        }

        this.stockQuantity -= quantity;
    }

    public void increaseStock(int quantity) {
        this.stockQuantity += quantity;
    }
}
