package com.example.oose_23_3_back.managementcontrol.control;

import com.example.oose_23_3_back.managementcontrol.service.BicycleService;
import com.example.oose_23_3_back.managementcontrol.entity.Bicycle;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class BicycleControl {
    private final BicycleService bicycleService;

    @PostMapping("/bicycleSave")
    public void bicycleSave(Bicycle bicycle) {
        this.bicycleService.bicycleSave(bicycle);
    }
}
