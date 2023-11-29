package com.veturatapi.services;

import com.veturatapi.models.VehicleDto;

import java.util.List;

public interface VehicleService {
    void add(VehicleDto vehicle);

    void modify(long id, VehicleDto updatedVehicle);

    void removeById(long id);

    VehicleDto findById(long id);

    List<VehicleDto> findAll();


}