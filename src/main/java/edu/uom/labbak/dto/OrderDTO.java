package edu.uom.labbak.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class OrderDTO {
    private Long id;
    private String orderNumber;
    private Double totalAmount;
    private String status;
    private LocalDateTime orderDate;
    private LocalDateTime deliveryDate;
    private String paymentMethod;
    private String paymentStatus;
    private String deliveryNotes;
    private Long farmerId;
    private String farmerName;
    private Long buyerId;
    private String buyerName;
    private AddressDTO deliveryAddress;
    private List<OrderItemDTO> orderItems;

    // Getters, setters, constructors
}
