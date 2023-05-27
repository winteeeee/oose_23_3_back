package com.example.oose_23_3_back.managementcontrol;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class RentalOfficeService {
    private final RentalOfficeRepository rentalOfficeRepository;

    public void rentalOfficeCreate(RentalOffice rentalOffice) {
        this.rentalOfficeRepository.save(rentalOffice);
    }
}
