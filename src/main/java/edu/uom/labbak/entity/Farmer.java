package edu.uom.labbak.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "farmers")
public class Farmer extends User {
    private String farmName;
    private String farmAddress;
    private Double farmLatitude;
    private Double farmLongitude;
    private Double farmSize; // in acres/hectares
    private String farmDescription;
    private String profileImage;
    private Double averageRating;

    @OneToMany(mappedBy = "farmer", cascade = CascadeType.ALL)
    @ToString.Exclude
    private List<Product> products;

    @OneToMany(mappedBy = "farmer")
    @ToString.Exclude
    private List<Order> orders;
}