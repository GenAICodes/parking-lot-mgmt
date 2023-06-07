
CREATE TABLE parking_lot (
    name VARCHAR(255) NOT NULL,
    location VARCHAR(255) NOT NULL,
    total_slots INT NOT NULL,
    available_slots INT NOT NULL,
    rating DOUBLE,
    reviews TEXT,
    PRIMARY KEY (name, location)
);
