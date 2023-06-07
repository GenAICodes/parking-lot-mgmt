
    package com.parking.mgmt.entity;
    import javax.persistence.*;
    import java.sql.Timestamp;
    
    @Entity
    @Table(name = "user_registration")
    public class UserRegistration {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String username;
        private String password;
        private String email;
        @Column(name = "phone_number")
        private String phoneNumber;
        @Column(name = "created_at")
        private Timestamp createdAt;
        
        // Constructors, getters, and setters
        public UserRegistration() {}
        
        public UserRegistration(String username, String password, String email, String phoneNumber, Timestamp createdAt) {
            this.username = username;
            this.password = password;
            this.email = email;
            this.phoneNumber = phoneNumber;
            this.createdAt = createdAt;
        }
        
        public Long getId() {
            return id;
        }
        
        public void setId(Long id) {
            this.id = id;
        }
        
        public String getUsername() {
            return username;
        }
        
        public void setUsername(String username) {
            this.username = username;
        }
        
        public String getPassword() {
            return password;
        }
        
        public void setPassword(String password) {
            this.password = password;
        }
        
        public String getEmail() {
            return email;
        }
        
        public void setEmail(String email) {
            this.email = email;
        }
        
        public String getPhoneNumber() {
            return phoneNumber;
        }
        
        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }
        
        public Timestamp getCreatedAt() {
            return createdAt;
        }
        
        public void setCreatedAt(Timestamp createdAt) {
            this.createdAt = createdAt;
        }
    }
