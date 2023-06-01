package com.example.oose_23_3_back.historycontrol.entity;

import com.example.oose_23_3_back.historycontrol.PaymentMethodEnum;
import com.example.oose_23_3_back.historycontrol.StatusEnum;
import com.example.oose_23_3_back.managementcontrol.entity.Bicycle;
import com.example.oose_23_3_back.membercontrol.entity.Member;
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
    private Long paymentDetailNumber;
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
