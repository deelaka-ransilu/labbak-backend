package edu.uom.labbak.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CropMarketTrendDTO {
    private String cropName;
    private Double currentAveragePrice;
    private Double priceChangeTrend; // Percentage change in last month
    private String trendDirection; // "UP", "DOWN", "STABLE"
    private Double predictedPriceNextMonth;
    private Double predictedPriceNextThreeMonths;
    private Integer demandLevel; // 1-10 scale
    private String season;
    private String region;
    private List<PriceHistoryPointDTO> priceHistory; // Last 6 months
    private Double supplyLevel; // 1-10 scale
    private String marketComment; // Analysis comment
}