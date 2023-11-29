package com.veturatapi.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VehicleDto {
    private long id;
    private String make;
    private String model;
    private String registrationNumber;
    private int year;
    private String color;
    private double mileage;

}