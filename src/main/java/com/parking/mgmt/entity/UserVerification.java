
    package com.parking.mgmt.entity;
    import javax.persistence.*;
    import java.sql.Timestamp;
    
    @Entity
    @Table(name = "user_verification")
    public class UserVerification {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @Column(name = "user_id")
        private Long userId;
        @Column(name = "verification_code")
        private String verificationCode;
        private Boolean verified;
        @Column(name = "created_at")
        private Timestamp createdAt;
        
        // Constructors, getters, and setters
        public UserVerification() {}
        
        public UserVerification(Long userId, String verificationCode, Boolean verified, Timestamp createdAt) {
            this.userId = userId;
            this.verificationCode = verificationCode;
            this.verified = verified;
            this.createdAt = createdAt;
        }
        
        public Long getId() {
            return id;
        }
        
        public void setId(Long id) {
            this.id = id;
        }
        
        public Long getUserId() {
            return userId;
        }
        
        public void setUserId(Long userId) {
            this.userId = userId;
        }
        
        public String getVerificationCode() {
            return verificationCode;
        }
        
        public void setVerificationCode(String verificationCode) {
            this.verificationCode = verificationCode;
        }
        
        public Boolean getVerified() {
            return verified;
        }
        
        public void setVerified(Boolean verified) {
            this.verified = verified;
        }
        
        public Timestamp getCreatedAt() {
            return createdAt;
        }
        
        public void setCreatedAt(Timestamp createdAt) {
            this.createdAt = createdAt;
        }
    }
