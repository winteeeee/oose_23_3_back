package com.example.oose_23_3_back.rentalcontrol;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class RentalControl {
    private final RentalService rentalService;

    //자전거 대여
    public boolean rentalBicycle() {
        return true;
    }

    //TODO 자전거 이용 이력 조회(본인)
}
