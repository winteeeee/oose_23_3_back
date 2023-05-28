package com.example.oose_23_3_back.rentalcontrol;

import com.example.oose_23_3_back.historycontrol.*;
import com.example.oose_23_3_back.managementcontrol.Bicycle;
import com.example.oose_23_3_back.managementcontrol.BicycleControl;
import com.example.oose_23_3_back.managementcontrol.RentalOffice;
import com.example.oose_23_3_back.membercontrol.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class RentalService {
    private final HistoryCheckControl historyCheckControl;
    private final PaymentDetailControl paymentDetailControl;
    private final BicycleControl bicycleControl;

    public boolean rentalBicycle(Member member, Bicycle bicycle, RentalOffice rentalOffice, Long rentalPayment, PaymentMethodEnum paymentMethod) {
        HistoryCheck historyCheck = new HistoryCheck();
        historyCheck.setMember(member);
        historyCheck.setBicycle(bicycle);
        historyCheck.setRentalOffice(rentalOffice);
        historyCheck.setRentalPayment(rentalPayment);
        historyCheck.setPaymentMethod(paymentMethod);
        this.historyCheckControl.historyCheckInsert(historyCheck);

        PaymentDetail paymentDetail = new PaymentDetail();
        paymentDetail.setMember(member);
        paymentDetail.setPaymentAmount(rentalPayment);
        paymentDetail.setPaymentMethod(paymentMethod);
        paymentDetail.setPaymentStatus(StatusEnum.APPROVAL);    //임시로 바로 승인되도록 설정
        this.paymentDetailControl.paymentDetailInsert(paymentDetail);

        bicycle.setIsRented(true);
        this.bicycleControl.bicycleSave(bicycle);

        return true;
    }

    public List<HistoryCheck> historyChecksRead(Member member) {
        return this.historyCheckControl.historyCheckRead(member);
    }
}
