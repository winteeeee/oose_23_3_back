package com.example.oose_23_3_back.historycontrol.control;

import com.example.oose_23_3_back.historycontrol.entity.HistoryCheck;
import com.example.oose_23_3_back.historycontrol.service.HistoryCheckService;
import com.example.oose_23_3_back.managementcontrol.service.BicycleService;
import com.example.oose_23_3_back.managementcontrol.service.RentalOfficeService;
import com.example.oose_23_3_back.membercontrol.entity.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RequiredArgsConstructor
@RestController
public class HistoryCheckControl {
    private final HistoryCheckService historyCheckService;
    private final BicycleService bicycleService;
    private final RentalOfficeService rentalOfficeService;

    //가입자 및 기간별 이용내역 조회
    @GetMapping("/historyCheck/{id}")
    public List<HistoryCheck> historyCheckRead(@PathVariable("id") Member member) {
        return this.historyCheckService.historyCheckRead(member);
    }

    @GetMapping("/historyCheck/{startDate}/{endDate}")
    public List<HistoryCheck> historyCheckRead(@PathVariable("startDate") String startPram, @PathVariable("endDate") String endPram) {
        String[] startPramArray = startPram.split("-");
        String[] endPramArray = endPram.split("-");
        LocalDateTime startDate = LocalDateTime.of(Integer.parseInt(startPramArray[0]), Integer.parseInt(startPramArray[1]), Integer.parseInt(startPramArray[2]), 0, 0);
        LocalDateTime endDate = LocalDateTime.of(Integer.parseInt(endPramArray[0]), Integer.parseInt(endPramArray[1]), Integer.parseInt(endPramArray[2]), 0, 0);

        return this.historyCheckService.historyCheckRead(startDate, endDate);
    }

    @PostMapping("/historyCheckDummy")
    public void historyCheckInsert(@SessionAttribute(name = "member", required = false) Member member, @RequestBody HistoryCheck historyCheck) {
        historyCheck.setMember(member);
        this.historyCheckService.historyCheckInsert(historyCheck);
    }

    @PostMapping("/historyCheckInsert")
    public void paymentDetailInsert(@RequestBody HistoryCheck historyCheck, @SessionAttribute(name = "member", required = false) Member member) {
        historyCheck.setMember(member);
        historyCheck.setBicycle(bicycleService.findById(historyCheck.getBicycle().getBicycleNumber()));
        historyCheck.setRentalOffice(rentalOfficeService.rentalOfficeFindById(historyCheck.getRentalOffice().getRentalOfficeNum()));
        historyCheck.setRentalTime(LocalDateTime.now());

        if (historyCheck.getReturnOffice().getRentalOfficeNum() != null) {
            historyCheck.setReturnOffice(rentalOfficeService.rentalOfficeFindById(historyCheck.getReturnOffice().getRentalOfficeNum()));

            LocalDateTime returnTime = historyCheck.getRentalTime();
            returnTime = returnTime.plusMinutes(historyCheck.getTravelTime().getMinute());
            returnTime = returnTime.plusSeconds(historyCheck.getTravelTime().getSecond());
            historyCheck.setReturnTime(returnTime);
        } else {
            historyCheck.setReturnOffice(null);
        }
        historyCheckService.historyCheckInsert(historyCheck);
    }
}