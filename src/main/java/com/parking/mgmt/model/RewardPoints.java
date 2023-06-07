
    package com.parking.mgmt.model;
    import javax.persistence.*;
    import java.sql.Timestamp;
    
    @Entity
    @Table(name = "reward_points")
    public class RewardPoints {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @Column(name = "user_id")
        private Long userId;
        private Integer points;
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
        public Integer getPoints() {
            return points;
        }
        public void setPoints(Integer points) {
            this.points = points;
        }
        public Timestamp getCreatedAt() {
            return createdAt;
        }
        public void setCreatedAt(Timestamp createdAt) {
            this.createdAt = createdAt;
        }
    }
