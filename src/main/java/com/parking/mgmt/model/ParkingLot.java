
    package com.parking.mgmt.model;
    
    import java.util.List;
    
    public class ParkingLot {
        private Long id;
        private String name;
        private String location;
        private Integer totalSlots;
        private Integer availableSlots;
        private Double rating;
        private List<String> reviews;
        
        // Constructor
        public ParkingLot(Long id, String name, String location, Integer totalSlots, Integer availableSlots, Double rating, List<String> reviews) {
            this.id = id;
            this.name = name;
            this.location = location;
            this.totalSlots = totalSlots;
            this.availableSlots = availableSlots;
            this.rating = rating;
            this.reviews = reviews;
        }
        
        // Getters and Setters
        public Long getId() {
            return id;
        }
        
        public void setId(Long id) {
            this.id = id;
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
        
        public Integer getTotalSlots() {
            return totalSlots;
        }
        
        public void setTotalSlots(Integer totalSlots) {
            this.totalSlots = totalSlots;
        }
        
        public Integer getAvailableSlots() {
            return availableSlots;
        }
        
        public void setAvailableSlots(Integer availableSlots) {
            this.availableSlots = availableSlots;
        }
        
        public Double getRating() {
            return rating;
        }
        
        public void setRating(Double rating) {
            this.rating = rating;
        }
        
        public List<String> getReviews() {
            return reviews;
        }
        
        public void setReviews(List<String> reviews) {
            this.reviews = reviews;
        }
    }
