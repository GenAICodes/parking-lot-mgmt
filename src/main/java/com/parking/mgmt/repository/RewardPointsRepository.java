
    package com.parking.mgmt.repository;
    import com.parking.mgmt.model.RewardPoints;
    import org.springframework.data.jpa.repository.JpaRepository;
    import org.springframework.stereotype.Repository;
    
    @Repository
    public interface RewardPointsRepository extends JpaRepository<RewardPoints, Long> {
        RewardPoints findByUserId(Long userId);
        void deleteByUserId(Long userId);
    }
