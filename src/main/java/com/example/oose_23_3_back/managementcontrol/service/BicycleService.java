package com.example.oose_23_3_back.managementcontrol.service;

import com.example.oose_23_3_back.managementcontrol.repository.BicycleRepository;
import com.example.oose_23_3_back.managementcontrol.entity.Bicycle;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BicycleService {
    private final BicycleRepository bicycleRepository;

    public void bicycleSave(Bicycle bicycle) {
        this.bicycleRepository.save(bicycle);
    }
}
