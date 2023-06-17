package com.example.oose_23_3_back.historycontrol.entity;

import com.example.oose_23_3_back.historycontrol.PaymentMethodEnum;
import com.example.oose_23_3_back.managementcontrol.entity.Bicycle;
import com.example.oose_23_3_back.managementcontrol.entity.RentalOffice;
import com.example.oose_23_3_back.membercontrol.entity.Member;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.time.LocalTime;

@Getter
@Setter
@Entity
@ToString
public class HistoryCheck {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long historyId;
    @ManyToOne
    private Member member;
    @ManyToOne
    private Bicycle bicycle;
    private LocalDateTime rentalTime;
    @ManyToOne
    private RentalOffice rentalOffice;
    private LocalDateTime returnTime;
    @ManyToOne
    private RentalOffice returnOffice;
    private Long rentalPayment;
    @Enumerated(EnumType.STRING)
    private PaymentMethodEnum paymentMethod;
    private Double mileage;
    private LocalTime travelTime;
}