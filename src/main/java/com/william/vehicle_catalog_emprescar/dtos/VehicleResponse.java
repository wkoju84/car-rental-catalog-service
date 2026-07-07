package com.william.vehicle_catalog_emprescar.dtos;

import com.william.vehicle_catalog_emprescar.domain.Vehicle;

import java.math.BigDecimal;
import java.util.UUID;

public record VehicleResponse(
        UUID id,
        String licensePlate,
        String carBrand,
        String carModel,
        int year,
        BigDecimal dailyRate,
        String status,
        String category,
        String location
) {
    public static VehicleResponse fromEntity (Vehicle vehicle){
        return new VehicleResponse(
                vehicle.getId(),
                vehicle.getLicensePlate(),
                vehicle.getCarBrand(),
                vehicle.getCarModel(),
                vehicle.getYear(),
                vehicle.getDailyRate(),
                vehicle.getStatus().name(),
                vehicle.getCategory().getName(),
                vehicle.getLocation().getName()
        );
    }
}
