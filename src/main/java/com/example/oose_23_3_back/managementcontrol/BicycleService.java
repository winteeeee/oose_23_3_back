package com.example.oose_23_3_back.managementcontrol;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BicycleService {
    private final BicycleRepository bicycleRepository;

    public void bicycleCreate(Bicycle bicycle) {
        this.bicycleRepository.save(bicycle);
    }
}
