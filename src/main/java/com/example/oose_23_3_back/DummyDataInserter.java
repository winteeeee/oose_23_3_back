package com.example.oose_23_3_back;

import com.example.oose_23_3_back.historycontrol.repository.HistoryCheckRepository;
import com.example.oose_23_3_back.historycontrol.repository.PaymentDetailRepository;
import com.example.oose_23_3_back.managementcontrol.repository.BicycleRepository;
import com.example.oose_23_3_back.managementcontrol.repository.RentalOfficeRepository;
import com.example.oose_23_3_back.membercontrol.repository.MemberRepository;
import com.example.oose_23_3_back.noticecontrol.repository.PostRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class DummyDataInserter {
    private final MemberRepository memberRepository;
    private final HistoryCheckRepository historyCheckRepository;
    private final PaymentDetailRepository paymentDetailRepository;
    private final PostRepository postRepository;
    private final BicycleRepository bicycleRepository;
    private final RentalOfficeRepository rentalOfficeRepository;

    public static void main(String[] args) {
        memberInsert();
        historyInsert();
        paymentDetailInsert();
        postInsert();
        bicycleInsert();
        rentalOfficeInsert();
    }

    public static void memberInsert() {

    }

    public static void historyInsert() {

    }

    public static void paymentDetailInsert() {

    }

    public static void postInsert() {

    }

    public static void bicycleInsert() {

    }

    public static void rentalOfficeInsert() {

    }
}
