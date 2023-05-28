package com.example.oose_23_3_back.historyControl;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class HistoryCheck {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer historyId;
    //TODO private Member member
    //TODO private Bicycle bictcle
    private LocalDateTime rentalTime;
    //TODO private RentalOffice rentalOffice
    @CreatedDate
    private LocalDateTime returnTime;
    //TODO private RentalOffice returnOffice;
    private Long rentalPayment;
    @Enumerated(EnumType.STRING)
    private PaymentMethodEnum paymentMethod;
    private Double mileage;
    private LocalDateTime travelTime;
}
