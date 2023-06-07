
    package com.parking.mgmt.model;
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
        
        // Getters and setters
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
