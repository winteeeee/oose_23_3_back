package com.example.oose_23_3_back.rentalcontrol.service;

import com.example.oose_23_3_back.historycontrol.*;
import com.example.oose_23_3_back.historycontrol.control.HistoryCheckControl;
import com.example.oose_23_3_back.historycontrol.control.PaymentDetailControl;
import com.example.oose_23_3_back.historycontrol.entity.HistoryCheck;
import com.example.oose_23_3_back.historycontrol.entity.PaymentDetail;
import com.example.oose_23_3_back.managementcontrol.entity.Bicycle;
import com.example.oose_23_3_back.managementcontrol.control.BicycleControl;
import com.example.oose_23_3_back.managementcontrol.entity.RentalOffice;
import com.example.oose_23_3_back.membercontrol.entity.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class RentalService {
    private final HistoryCheckControl historyCheckControl;
    private final BicycleControl bicycleControl;

    public boolean rentalBicycle(Bicycle bicycle) {
        bicycle.setIsRented(true);
        this.bicycleControl.bicycleSave(bicycle);

        return true;
    }

    public List<HistoryCheck> historyChecksRead(Member member) {
        return this.historyCheckControl.historyCheckRead(member);
    }
}
