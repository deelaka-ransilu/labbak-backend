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
@Table(name = "buyers")
public class Buyer extends User {
    private String profileImage;

    @OneToMany(mappedBy = "buyer", cascade = CascadeType.ALL)
    @ToString.Exclude
    private List<Address> addresses;

    @OneToMany(mappedBy = "buyer")
    @ToString.Exclude
    private List<Order> orders;
}