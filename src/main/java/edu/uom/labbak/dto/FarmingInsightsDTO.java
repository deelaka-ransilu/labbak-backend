package edu.uom.labbak.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class FarmingInsightsDTO {
    private List<CropRecommendationDTO> recommendedCrops;
    private List<WeatherForecastDTO> weatherForecasts;
    private List<CropMarketTrendDTO> marketTrends;
    private Map<String, Double> soilConditions;
    private List<String> farmingTips;
    private Double estimatedProfitPotential; // In percentage
    private Map<String, Integer> cropDemandRanking; // Crop name to ranking (1-10)
    private List<String> pestAlerts;
    private Double estimatedWaterRequirement; // In liters/hectare
    private List<String> sustainableFarmingPractices;
}
