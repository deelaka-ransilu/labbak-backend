package edu.uom.labbak.controller;

import edu.uom.labbak.dto.CropMarketTrendDTO;
import edu.uom.labbak.dto.CropRecommendationDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/crops")
public class CropRecommendationController {

    @GetMapping("/recommendations")
    public ResponseEntity<List<CropRecommendationDTO>> getCropRecommendations(
            @RequestParam(required = false) String region,
            @RequestParam(required = false) String season,
            @RequestParam(required = false) Double latitude,
            @RequestParam(required = false) Double longitude) {
        // Get crop recommendations logic
        return null;
    }

    @GetMapping("/trends")
    public ResponseEntity<List<CropMarketTrendDTO>> getCropMarketTrends(
            @RequestParam(required = false) String region) {
        // Get crop market trends logic
        return null;
    }
}