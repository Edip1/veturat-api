package com.veturatapi.repositories;

import com.veturatapi.entities.VehicleEntities;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<VehicleEntities, Long> {
}

