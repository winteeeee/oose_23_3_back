package com.example.oose_23_3_back.managementcontrol.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Bicycle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bicycleNumber;
    private Boolean isRented;
    private Boolean isBroken;
    @ManyToOne
    private RentalOffice rentalOffice;
}
