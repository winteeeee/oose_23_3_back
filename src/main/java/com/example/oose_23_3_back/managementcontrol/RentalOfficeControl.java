package com.example.oose_23_3_back.managementcontrol;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class RentalOfficeControl {
    private final RentalOfficeService rentalOfficeService;

    @PostMapping("/rentalOfficeCreate")
    public void rentalOfficeCreate(RentalOffice rentalOffice) {
        this.rentalOfficeService.rentalOfficeCreate(rentalOffice);
    }
}
