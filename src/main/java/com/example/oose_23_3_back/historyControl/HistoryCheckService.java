package com.example.oose_23_3_back.historyControl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class HistoryCheckService {
    private final HistoryCheckRepository historyCheckRepository;
}
