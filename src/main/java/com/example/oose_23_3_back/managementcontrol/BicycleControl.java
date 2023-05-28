package com.example.oose_23_3_back.managementcontrol;

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
