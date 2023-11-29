package com.veturatapi.controllers;


import com.veturatapi.models.VehicleDto;
import com.veturatapi.services.VehicleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vehicles")
public class VehicleController {
    private final VehicleService vehicleService;

    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @GetMapping
    public List<VehicleDto> getAllVehicles() {
        return vehicleService.findAll();
    }

    @GetMapping("/{id}")
    public VehicleDto getVehicleById(@PathVariable long id) {
        return vehicleService.findById(id);
    }

    @PostMapping
    public void addVehicle(@RequestBody VehicleDto newVehicle) {
        vehicleService.add(newVehicle);
    }

    @PutMapping("/{id}")
    public void updateVehicle(@PathVariable long id, @RequestBody VehicleDto updatedVehicle) {
        vehicleService.modify(id, updatedVehicle);
    }

    @DeleteMapping("/{id}")
    public void deleteVehicle(@PathVariable long id) {
        vehicleService.removeById(id);
    }
}