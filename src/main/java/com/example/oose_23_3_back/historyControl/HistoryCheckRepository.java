package com.example.oose_23_3_back.historyControl;

import com.example.oose_23_3_back.membercontrol.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface HistoryCheckRepository extends JpaRepository<HistoryCheck, Integer> {
    List<HistoryCheck> findByMember(Member member);
    List<HistoryCheck> findByMemberAndRentalTimeAfterAndReturnTimeBefore(Member member, LocalDateTime startDate, LocalDateTime endDate);
}
