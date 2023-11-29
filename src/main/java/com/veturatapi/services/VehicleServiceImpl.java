package com.veturatapi.services;


import com.veturatapi.mappers.VehicleMapper;
import com.veturatapi.models.VehicleDto;
import com.veturatapi.repositories.VehicleRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleServiceImpl implements VehicleService {

    private final VehicleRepository repository;
    private final VehicleMapper vehicleMapper;

    public VehicleServiceImpl(VehicleRepository repository, VehicleMapper vehicleMapper) {
        this.repository = repository;
        this.vehicleMapper = vehicleMapper;
    }

    @Override
    public void add(VehicleDto vehicleDto) {
        var entity = vehicleMapper.toEntity(vehicleDto);
        repository.save(entity);
    }

    @Override
    public void modify(long id, VehicleDto updatedVehicle) {
        var optionalEntity = repository.findById(id);
        if (optionalEntity.isEmpty())
            throw new RuntimeException("Vehicle not found");

        var entity = optionalEntity.get();

        entity.setModel(updatedVehicle.getModel());
        entity.setMake(updatedVehicle.getMake());
        entity.setYear(updatedVehicle.getYear());
        entity.setYear(updatedVehicle.getYear());

        repository.save(entity);
    }

    @Override
    public void removeById(long id) {
        repository.deleteById(id);
    }

    @Override
    public VehicleDto findById(long id) {
        var entity = repository.findById(id);
        if (entity.isEmpty())
            throw new RuntimeException("Vehicle not found");
        var dto = vehicleMapper.toDto(entity.get());
        return dto;
    }

    @Override
    public List<VehicleDto> findAll() {
        return repository.findAll().stream().map(vehicleMapper::toDto).toList();
    }
}
