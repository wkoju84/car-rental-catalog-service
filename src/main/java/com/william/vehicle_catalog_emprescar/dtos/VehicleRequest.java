package com.william.vehicle_catalog_emprescar.dtos;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.UUID;

public record VehicleRequest(
        @NotNull
        UUID categoryId,

        @NotNull
        UUID locationId,

        @NotBlank
        String licensePlate,

        @NotBlank
        String carBrand,

        @NotBlank
        String carModel,

        @Min(1980)
        int year,

        @NotNull
        @DecimalMin(value = "0.0", inclusive = false)
        BigDecimal dailyRate
) {
}
