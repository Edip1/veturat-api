package com.veturatapi.mappers;

import com.veturatapi.entities.VehicleEntities;
import com.veturatapi.models.VehicleDto;
import org.springframework.stereotype.Component;

@Component
public class VehicleMapper {

    public VehicleEntities toEntity(VehicleDto dto) {
        VehicleEntities entity = new VehicleEntities();
        entity.setId(dto.getId());
        entity.setMake(dto.getMake());
        entity.setModel(dto.getModel());
        entity.setRegistrationNumber(dto.getRegistrationNumber());
        entity.setYear(dto.getYear());
        entity.setColor(dto.getColor());
        entity.setMileage(dto.getMileage());

        return entity;
    }

    public VehicleDto toDto(VehicleEntities entity) {
        VehicleDto dto = new VehicleDto();
        dto.setId(entity.getId());
        dto.setMake(entity.getMake());
        dto.setModel(entity.getModel());
        dto.setRegistrationNumber(entity.getRegistrationNumber());
        dto.setYear(entity.getYear());
        dto.setColor(entity.getColor());
        dto.setMileage(entity.getMileage());

        return dto;
    }

}
