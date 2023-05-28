package com.example.oose_23_3_back.historyControl;

import com.example.oose_23_3_back.membercontrol.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PaymentDetailRepository extends JpaRepository<PaymentDetail, Integer> {
    List<PaymentDetail> findByMember(Member member);
    List<PaymentDetail> findByMemberAndPaymentStatus(Member member, StatusEnum statusEnum);
}
