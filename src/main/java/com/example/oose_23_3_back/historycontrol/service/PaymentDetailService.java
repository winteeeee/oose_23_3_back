package com.example.oose_23_3_back.historycontrol.service;

import com.example.oose_23_3_back.historycontrol.StatusEnum;
import com.example.oose_23_3_back.historycontrol.repository.PaymentDetailRepository;
import com.example.oose_23_3_back.historycontrol.entity.PaymentDetail;
import com.example.oose_23_3_back.membercontrol.entity.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class PaymentDetailService {
    private final PaymentDetailRepository paymentDetailRepository;

    public List<PaymentDetail> paymentDetailRead(Member member) {
        return this.paymentDetailRepository.findByMember(member);
    }

    public List<PaymentDetail> refundPaymentDetailRead(Member member) {
        return this.paymentDetailRepository.findByMemberAndPaymentStatus(member, StatusEnum.REFUND);
    }

    public void paymentDetailInsert(PaymentDetail paymentDetail) {
        this.paymentDetailRepository.save(paymentDetail);
    }
}