package com.example.oose_23_3_back.historyControl;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@RestController
public class historyCheckControl {
    private final HistoryCheckService historyCheckService;

    //가입자 및 기간별 이용내역 조회
    public HistoryCheck historyCheckRead() {
        return null;
        //TODO 인자로 사용자를 받아 사용자의 이용내역 전체 조회
    }

    public HistoryCheck historyCheckRead(LocalDateTime startDate, LocalDateTime endDate) {
        return null;
        //TODO 인자로 사용자를 받아 기간 내의 이용내역 전체 조회
    }
}
