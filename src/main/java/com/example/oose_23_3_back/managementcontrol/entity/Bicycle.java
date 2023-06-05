package com.example.oose_23_3_back.managementcontrol.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @JsonBackReference
    private RentalOffice rentalOffice;
}
