package edu.uom.labbak.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ProductDTO {
    private Long id;
    private String name;
    private String description;
    private Double price;
    private String unit;
    private Double availableQuantity;
    private String category;
    private String cultivationType;
    private LocalDate harvestDate;
    private LocalDate expiryDate;
    private boolean isAvailable;
    private Long farmerId;
    private String farmerName;
    private String farmName;
    private List<String> imageUrls;
    private String primaryImageUrl;
}
