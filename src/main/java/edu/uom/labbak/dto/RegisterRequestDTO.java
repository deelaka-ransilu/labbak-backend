package edu.uom.labbak.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequestDTO {
    private String name;
    private String email;
    private String password;
    private String phoneNumber;
    private String role;

    private String farmName;
    private String farmAddress;
    private Double farmLatitude;
    private Double farmLongitude;
    private Double farmSize;
    private String farmDescription;
}
