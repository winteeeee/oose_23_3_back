package com.example.oose_23_3_back.rentalcontrol.control;

import com.example.oose_23_3_back.historycontrol.entity.HistoryCheck;
import com.example.oose_23_3_back.historycontrol.PaymentMethodEnum;
import com.example.oose_23_3_back.managementcontrol.entity.Bicycle;
import com.example.oose_23_3_back.managementcontrol.entity.RentalOffice;
import com.example.oose_23_3_back.membercontrol.entity.Member;
import com.example.oose_23_3_back.rentalcontrol.service.RentalService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class RentalControl {
    private final RentalService rentalService;

    //자전거 대여
    public boolean rentalBicycle(Bicycle bicycle) {
        return this.rentalService.rentalBicycle(bicycle);
        //TODO 프론트에서 데이터가 넘어올 땐 String으로 넘어올 것이므로 Enum과 매핑하는 과정 필요할듯
    }

    //자전거 이용 이력 조회(본인)
    public List<HistoryCheck> historyChecksRead(Member member) {
        return rentalService.historyChecksRead(member);
    }
}
