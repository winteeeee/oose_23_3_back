package com.example.oose_23_3_back.rentalcontrol;

import com.example.oose_23_3_back.historycontrol.HistoryCheck;
import com.example.oose_23_3_back.historycontrol.PaymentMethodEnum;
import com.example.oose_23_3_back.managementcontrol.Bicycle;
import com.example.oose_23_3_back.managementcontrol.RentalOffice;
import com.example.oose_23_3_back.membercontrol.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class RentalControl {
    private final RentalService rentalService;

    //자전거 대여
    public boolean rentalBicycle(Member member, Bicycle bicycle, RentalOffice rentalOffice, Long rentalPayment, PaymentMethodEnum paymentMethod) {
        return this.rentalService.rentalBicycle(member, bicycle, rentalOffice, rentalPayment, paymentMethod);
        //TODO 프론트에서 데이터가 넘어올 땐 String으로 넘어올 것이므로 Enum과 매핑하는 과정 필요할듯
    }

    //자전거 이용 이력 조회(본인)
    public List<HistoryCheck> historyChecksRead(Member member) {
        return rentalService.historyChecksRead(member);
    }
}
