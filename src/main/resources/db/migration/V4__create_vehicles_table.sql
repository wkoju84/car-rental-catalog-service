CREATE TABLE vehicles (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    category_id UUID NOT NULL REFERENCES vehicle_categories(id),
    location_id UUID NOT NULL REFERENCES locations(id),
    license_plate VARCHAR(10) NOT NULL UNIQUE,
    car_brand VARCHAR(50) NOT NULL,
    car_model VARCHAR(50) NOT NULL,
    year INT NOT NULL,
    daily_rate NUMERIC(10,2) NOT NULL,
    status VARCHAR(20) NOT NULL DEFAULT 'AVAILABLE'
);