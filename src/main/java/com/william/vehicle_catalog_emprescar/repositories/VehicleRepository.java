package com.william.vehicle_catalog_emprescar.repositories;

import com.william.vehicle_catalog_emprescar.domain.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, UUID> {
}
