package com.veturatapi.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Year;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VehicleListDto {
    private long id;
    private String make;
    private String model;
    private Year year;
}
