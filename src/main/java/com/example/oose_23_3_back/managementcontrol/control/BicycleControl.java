package com.example.oose_23_3_back.managementcontrol.control;

import com.example.oose_23_3_back.managementcontrol.entity.RentalOffice;
import com.example.oose_23_3_back.managementcontrol.service.BicycleService;
import com.example.oose_23_3_back.managementcontrol.entity.Bicycle;
import com.example.oose_23_3_back.managementcontrol.service.RentalOfficeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class BicycleControl {
    private final BicycleService bicycleService;
    private final RentalOfficeService rentalOfficeService;

    @PostMapping("/bicycleInsert")
    public String bicycleSave(@RequestBody Bicycle bicycle) {
        if (!this.bicycleService.idVerification(bicycle.getBicycleNumber())) {
            return "id";
        }

        RentalOffice rentalOffice = rentalOfficeService.rentalOfficeFindById(bicycle.getRentalOffice().getRentalOfficeNum());
        if (rentalOffice == null) {
            return "rentalOfficeNull";
        }

        if (this.rentalOfficeService.isOverMaximumBicycle(rentalOffice)) {
            return "over";
        }

        bicycle.setRentalOffice(rentalOffice);
        this.bicycleService.bicycleSave(bicycle);
        return "success";
    }

    @GetMapping("/bicycleSearch/{rentalOfficeId}")
    public List<Bicycle> findBicycleByRentalOffice(@PathVariable("rentalOfficeId") RentalOffice rentalOffice) {
        return bicycleService.findBicycleByRentalOffice(rentalOffice);
    }
}
