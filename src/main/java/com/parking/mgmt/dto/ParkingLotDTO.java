
package com.parking.mgmt.dto;

public class ParkingLotDTO {

    private String name;
    private String location;
    private int totalSlots;
    private int availableSlots;
    private double rating;
    private String reviews;

    public ParkingLotDTO() {
    }

    public ParkingLotDTO(String name, String location, int totalSlots, int availableSlots, double rating, String reviews) {
        this.name = name;
        this.location = location;
        this.totalSlots = totalSlots;
        this.availableSlots = availableSlots;
        this.rating = rating;
        this.reviews = reviews;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getTotalSlots() {
        return totalSlots;
    }

    public void setTotalSlots(int totalSlots) {
        this.totalSlots = totalSlots;
    }

    public int getAvailableSlots() {
        return availableSlots;
    }

    public void setAvailableSlots(int availableSlots) {
        this.availableSlots = availableSlots;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getReviews() {
        return reviews;
    }

    public void setReviews(String reviews) {
        this.reviews = reviews;
    }
}
