
    package com.parking.mgmt.repository;
    import com.parking.mgmt.model.UserVerification;
    import org.springframework.data.jpa.repository.JpaRepository;
    import org.springframework.stereotype.Repository;
    
    @Repository
    public interface UserVerificationRepository extends JpaRepository<UserVerification, Long> {
        UserVerification findByUserId(Long userId);
        void deleteByUserId(Long userId);
    }
