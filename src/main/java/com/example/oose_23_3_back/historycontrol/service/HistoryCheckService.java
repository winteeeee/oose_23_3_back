package com.example.oose_23_3_back.historycontrol.service;

import com.example.oose_23_3_back.historycontrol.repository.HistoryCheckRepository;
import com.example.oose_23_3_back.historycontrol.entity.HistoryCheck;
import com.example.oose_23_3_back.membercontrol.entity.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@RequiredArgsConstructor
@Service
public class HistoryCheckService {
    private final HistoryCheckRepository historyCheckRepository;

    public List<HistoryCheck> historyCheckRead(Member member) {
        return this.historyCheckRepository.findByMember(member);
    }

    public List<HistoryCheck> historyCheckRead(Member member, LocalDateTime startDate, LocalDateTime endDate) {
        return this.historyCheckRepository.findByMemberAndRentalTimeAfterAndReturnTimeBefore(member, startDate, endDate);
    }

    public void historyCheckInsert(HistoryCheck historyCheck) {
        this.historyCheckRepository.save(historyCheck);
    }
}