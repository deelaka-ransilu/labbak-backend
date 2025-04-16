package edu.uom.labbak.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class PriceHistoryPointDTO {
    private String date; // Month and year
    private Double averagePrice;
    private Double highestPrice;
    private Double lowestPrice;
    private Double volume; // Trading volume
}