package com.example.oose_23_3_back.historycontrol.control;

import com.example.oose_23_3_back.historycontrol.entity.PaymentDetail;
import com.example.oose_23_3_back.historycontrol.service.PaymentDetailService;
import com.example.oose_23_3_back.membercontrol.entity.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class PaymentDetailControl {
    private final PaymentDetailService paymentDetailService;

    @GetMapping("/paymentDetailSearch")
    public List<PaymentDetail> paymentDetailRead(@SessionAttribute(name = "member", required = false) Member member) {
        return this.paymentDetailService.paymentDetailRead(member);
    }

    @PostMapping("/paymentDetailInsert")
    public void paymentDetailInsert(PaymentDetail paymentDetail) {
        this.paymentDetailService.paymentDetailInsert(paymentDetail);
    }
}