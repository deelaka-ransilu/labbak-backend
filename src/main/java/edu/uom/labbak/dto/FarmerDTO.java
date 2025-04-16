package edu.uom.labbak.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor

public class FarmerDTO extends UserDTO {
    private String farmName;
    private String farmAddress;
    private Double farmLatitude;
    private Double farmLongitude;
    private Double farmSize;
    private String farmDescription;
    private String profileImage;
    private Double averageRating;
}