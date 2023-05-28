package com.example.oose_23_3_back.historyControl;

import com.example.oose_23_3_back.membercontrol.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class PaymentDetailControl {
    private final PaymentDetailService paymentDetailService;

    public List<PaymentDetail> paymentDetailRead(Member member) {
        return this.paymentDetailService.paymentDetailRead(member);
    }

    public List<PaymentDetail> refundPaymentDetailRead(Member member) {
        return this.paymentDetailService.refundPaymentDetailRead(member);
    }
}
