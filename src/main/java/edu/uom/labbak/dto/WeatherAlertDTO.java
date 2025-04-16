package edu.uom.labbak.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class WeatherAlertDTO {
    private Long id;
    private String alertType;
    private String description;
    private String severity;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String region;
}
