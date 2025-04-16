package edu.uom.labbak.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CropRecommendationDTO {
    private Long id;
    private String cropName;
    private String season;
    private String description;
    private String idealSoilType;
    private Double idealTemperatureMin;
    private Double idealTemperatureMax;
    private Integer growthPeriodDays;
    private String region;
    private Double expectedYield;
    private Double currentMarketDemand;
    private Double expectedPricePerUnit;

    // Getters, setters, constructors
}
