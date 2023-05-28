package com.example.oose_23_3_back.managementcontrol.repository;

import com.example.oose_23_3_back.managementcontrol.entity.Bicycle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BicycleRepository extends JpaRepository<Bicycle, Integer> {
}
