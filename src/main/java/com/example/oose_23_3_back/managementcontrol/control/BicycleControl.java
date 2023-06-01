package com.example.oose_23_3_back.managementcontrol.control;

import com.example.oose_23_3_back.managementcontrol.entity.RentalOffice;
import com.example.oose_23_3_back.managementcontrol.service.BicycleService;
import com.example.oose_23_3_back.managementcontrol.entity.Bicycle;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class BicycleControl {
    private final BicycleService bicycleService;

    @PostMapping("/bicycleInsert")
    public void bicycleSave(Bicycle bicycle) {
        this.bicycleService.bicycleSave(bicycle);
    }

    @GetMapping("/bicycleSearch/{rentalOfficeId}")
    public List<Bicycle> findBicycleByRentalOffice(@PathVariable("rentalOfficeId") RentalOffice rentalOffice) {
        return bicycleService.findBicycleByRentalOffice(rentalOffice);
    }
}
