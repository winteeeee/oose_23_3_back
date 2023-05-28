package com.example.oose_23_3_back.historycontrol;

import com.example.oose_23_3_back.managementcontrol.Bicycle;
import com.example.oose_23_3_back.managementcontrol.RentalOffice;
import com.example.oose_23_3_back.membercontrol.Member;
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
    @ManyToOne
    private Member member;
    @ManyToOne
    private Bicycle bicycle;
    @CreatedDate
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
    private LocalDateTime travelTime;
}