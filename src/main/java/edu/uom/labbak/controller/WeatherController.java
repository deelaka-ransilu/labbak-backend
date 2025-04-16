package edu.uom.labbak.controller;

import edu.uom.labbak.dto.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/weather")
public class WeatherController {

    @GetMapping("/forecast")
    public ResponseEntity<List<WeatherForecastDTO>> getWeatherForecast(
            @RequestParam(required = false) String region,
            @RequestParam(required = false) Double latitude,
            @RequestParam(required = false) Double longitude) {
        // Get weather forecast logic
        return null;
    }

    @GetMapping("/alerts")
    public ResponseEntity<List<WeatherAlertDTO>> getWeatherAlerts(
            @RequestParam(required = false) String region,
            @RequestParam(required = false) Double latitude,
            @RequestParam(required = false) Double longitude) {
        // Get weather alerts logic
        return null;
    }
}
