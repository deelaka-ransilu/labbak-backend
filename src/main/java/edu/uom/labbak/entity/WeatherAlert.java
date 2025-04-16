package edu.uom.labbak.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "weather_alerts")
public class WeatherAlert {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String alertType; // "RAIN", "DROUGHT", "STORM", etc.
    private String description;
    private String severity; // "LOW", "MEDIUM", "HIGH"
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String region;
    private Double latitude;
    private Double longitude;
    private LocalDateTime createdAt;
}
