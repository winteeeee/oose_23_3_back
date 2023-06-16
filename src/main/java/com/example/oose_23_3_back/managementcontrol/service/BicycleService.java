package com.example.oose_23_3_back.managementcontrol.service;

import com.example.oose_23_3_back.managementcontrol.entity.RentalOffice;
import com.example.oose_23_3_back.managementcontrol.repository.BicycleRepository;
import com.example.oose_23_3_back.managementcontrol.entity.Bicycle;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BicycleService {
    private final BicycleRepository bicycleRepository;
    private final RentalOfficeService rentalOfficeService;

    public void bicycleSave(Bicycle bicycle) {
        RentalOffice rentalOffice = rentalOfficeService.rentalOfficeFindById(bicycle.getRentalOffice().getRentalOfficeNum());
        bicycle.setRentalOffice(rentalOffice);
        System.out.println(bicycle);
        this.bicycleRepository.save(bicycle);
        //TODO 최대 수용 자전거 이상이면 삽입되면 안됨
    }

    public List<Bicycle> findBicycleByRentalOffice(RentalOffice rentalOffice) {
        return bicycleRepository.findByRentalOffice(rentalOffice);
    }

    public boolean rentalBicycle(Bicycle bicycle) {
        bicycle.setIsRented(!bicycle.getIsRented());
        this.bicycleRepository.save(bicycle);

        return true;
    }

    public Bicycle findById(Long id) {
        return this.bicycleRepository.findById(id).orElse(null);
    }
}
