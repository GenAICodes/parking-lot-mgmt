
    package com.parking.mgmt.entity;
    import javax.persistence.*;
    @Entity
    @Table(name = "user")
    public class User {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String name;
        private String email;
        private String password;
        private boolean isVerified;
        private int rewardPoints;
        // Getters and setters
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
        public String getEmail() {
            return email;
        }
        public void setEmail(String email) {
            this.email = email;
        }
        public String getPassword() {
            return password;
        }
        public void setPassword(String password) {
            this.password = password;
        }
        public boolean isVerified() {
            return isVerified;
        }
        public void setVerified(boolean verified) {
            isVerified = verified;
        }
        public int getRewardPoints() {
            return rewardPoints;
        }
        public void setRewardPoints(int rewardPoints) {
            this.rewardPoints = rewardPoints;
        }
    }
