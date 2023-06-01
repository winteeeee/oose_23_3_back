package com.example.oose_23_3_back.managementcontrol.repository;

import com.example.oose_23_3_back.managementcontrol.entity.Bicycle;
import com.example.oose_23_3_back.managementcontrol.entity.RentalOffice;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BicycleRepository extends JpaRepository<Bicycle, Long> {
    List<Bicycle> findByRentalOffice(RentalOffice rentalOffice);
}
