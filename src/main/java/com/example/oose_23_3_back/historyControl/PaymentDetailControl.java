package com.example.oose_23_3_back.historyControl;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class PaymentDetailControl {
    private final PaymentDetailService paymentDetailService;

    public PaymentDetail paymentDetailRead() {
        return null;
        //TODO 인자로 사용자를 받아서 해당 사용자의 결제내역 전체 조회
    }

    public PaymentDetail refundPaymentDetailRead() {
        return null;
        //TODO 인자로 사용자를 받아서 해당 사용자의 결제내역 중 환불 상태인 것만 조회
    }
}
