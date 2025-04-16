package edu.uom.labbak.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class WeatherForecastDTO {
    private String date;
    private Double temperature;
    private Double humidity;
    private String weatherCondition;
    private Double rainfall;
    private Double windSpeed;
    private String region;
}
