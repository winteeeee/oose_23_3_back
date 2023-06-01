package com.example.oose_23_3_back.historycontrol.repository;

import com.example.oose_23_3_back.historycontrol.StatusEnum;
import com.example.oose_23_3_back.historycontrol.entity.PaymentDetail;
import com.example.oose_23_3_back.membercontrol.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PaymentDetailRepository extends JpaRepository<PaymentDetail, Long> {
    List<PaymentDetail> findByMember(Member member);
    List<PaymentDetail> findByMemberAndPaymentStatus(Member member, StatusEnum statusEnum);
}
