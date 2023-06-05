package com.example.oose_23_3_back.managementcontrol.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
public class Bicycle {
    @Id
    private Long bicycleNumber;
    private Boolean isRented;
    private Boolean isBroken;
    @ManyToOne
    private RentalOffice rentalOffice;
}
