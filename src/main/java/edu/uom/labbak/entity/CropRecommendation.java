package edu.uom.labbak.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.*;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "crop_recommendations")
public class CropRecommendation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    private Double currentMarketDemand; // 1-10 scale
    private Double expectedPricePerUnit;
}
