package com.example.oose_23_3_back.rentalcontrol.control;

import com.example.oose_23_3_back.historycontrol.entity.HistoryCheck;
import com.example.oose_23_3_back.historycontrol.service.HistoryCheckService;
import com.example.oose_23_3_back.managementcontrol.entity.Bicycle;
import com.example.oose_23_3_back.managementcontrol.service.BicycleService;
import com.example.oose_23_3_back.membercontrol.entity.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class RentalControl {
    private final HistoryCheckService historyCheckService;
    private final BicycleService bicycleService;

    //자전거 대여
    @GetMapping("/bicycleRental/{bicycleId}")
    public boolean rentalBicycle(@PathVariable("bicycleId") Bicycle bicycle) {
        return this.bicycleService.rentalBicycle(bicycle);
    }

    //자전거 이용 이력 조회(본인)
    @GetMapping("/bicycleHistoryCheck/{userId}")
    public List<HistoryCheck> historyChecksRead(@PathVariable("userId") Member member) {
        return this.historyCheckService.historyCheckRead(member);
    }
}
