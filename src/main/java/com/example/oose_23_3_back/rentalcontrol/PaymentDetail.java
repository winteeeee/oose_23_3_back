package com.example.oose_23_3_back.rentalcontrol;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class PaymentDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer memberNumber;
    @CreatedDate
    private LocalDateTime paymentDate;
    private Long paymentAmount;
    @Enumerated(EnumType.STRING)
    private PaymentMethodEnum paymentMethod;
    //TODO private Bicycle bicycle
    @Enumerated(EnumType.STRING)
    private StatusEnum paymentStatus;
}
