package com.example.oose_23_3_back.historyControl;

import com.example.oose_23_3_back.managementcontrol.Bicycle;
import com.example.oose_23_3_back.membercontrol.Member;
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
    private Integer paymentDetailNumber;
    @ManyToOne
    private Member member;
    @ManyToOne
    private Bicycle bicycle;
    @CreatedDate
    private LocalDateTime paymentDate;
    private Long paymentAmount;
    @Enumerated(EnumType.STRING)
    private PaymentMethodEnum paymentMethod;
    @Enumerated(EnumType.STRING)
    private StatusEnum paymentStatus;
}
