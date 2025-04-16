package edu.uom.labbak.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class OrderItemDTO {
    private Long id;
    private Double quantity;
    private Double pricePerUnit;
    private Double totalPrice;
    private Long productId;
    private String productName;
    private String productImage;
}
