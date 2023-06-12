package com.example.oose_23_3_back.historycontrol.control;

import com.example.oose_23_3_back.historycontrol.entity.PaymentDetail;
import com.example.oose_23_3_back.historycontrol.service.PaymentDetailService;
import com.example.oose_23_3_back.managementcontrol.service.BicycleService;
import com.example.oose_23_3_back.membercontrol.entity.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class PaymentDetailControl {
    private final PaymentDetailService paymentDetailService;
    private final BicycleService bicycleService;

    @GetMapping("/paymentDetailSearch/{id}")
    public List<PaymentDetail> paymentDetailRead(@PathVariable("id") Member member) {
        return this.paymentDetailService.paymentDetailRead(member);
    }

    @PostMapping("/paymentDetailInsert")
    public void paymentDetailInsert(@RequestBody PaymentDetail paymentDetail, @SessionAttribute(name = "member", required = false) Member member) {
        paymentDetail.setMember(member);
        paymentDetail.setBicycle(bicycleService.findById(paymentDetail.getBicycle().getBicycleNumber()));
        this.paymentDetailService.paymentDetailInsert(paymentDetail);
    }
}