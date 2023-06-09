package com.example.oose_23_3_back.historycontrol.control;

import com.example.oose_23_3_back.historycontrol.entity.HistoryCheck;
import com.example.oose_23_3_back.historycontrol.service.HistoryCheckService;
import com.example.oose_23_3_back.membercontrol.entity.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RequiredArgsConstructor
@RestController
public class HistoryCheckControl {
    private final HistoryCheckService historyCheckService;

    //가입자 및 기간별 이용내역 조회
    @GetMapping("/historyCheck/{userId}")
    public List<HistoryCheck> historyCheckRead(@PathVariable("userId") Member member) {
        return this.historyCheckService.historyCheckRead(member);
    }

    @GetMapping("/historyCheck/{startDate}/{endDate}")
    public List<HistoryCheck> historyCheckRead(@PathVariable("startDate") LocalDateTime startDate, @PathVariable("endDate") LocalDateTime endDate) {
        return this.historyCheckService.historyCheckRead(startDate, endDate);
    }

    @PostMapping("/historyCheckDummy")
    public void historyCheckInsert(@SessionAttribute(name = "member", required = false) Member member, @RequestBody HistoryCheck historyCheck) {
        System.out.println(member);
        historyCheck.setMember(member);
        this.historyCheckService.historyCheckInsert(historyCheck);
    }
}