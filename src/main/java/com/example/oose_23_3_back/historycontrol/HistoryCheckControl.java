package com.example.oose_23_3_back.historycontrol;

import com.example.oose_23_3_back.membercontrol.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RequiredArgsConstructor
@RestController
public class HistoryCheckControl {
    private final HistoryCheckService historyCheckService;

    //가입자 및 기간별 이용내역 조회
    public List<HistoryCheck> historyCheckRead(Member member) {
        return this.historyCheckService.historyCheckRead(member);
    }

    public List<HistoryCheck> historyCheckRead(Member member, LocalDateTime startDate, LocalDateTime endDate) {
        return this.historyCheckService.historyCheckRead(member, startDate, endDate);
    }

    public void historyCheckInsert(HistoryCheck historyCheck) {
        this.historyCheckService.historyCheckInsert(historyCheck);
    }
}