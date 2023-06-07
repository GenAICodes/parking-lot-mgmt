
    package com.parking.mgmt.repository;
    import com.parking.mgmt.model.UserRegistration;
    import org.springframework.data.jpa.repository.JpaRepository;
    import org.springframework.stereotype.Repository;
    
    @Repository
    public interface UserRepository extends JpaRepository<UserRegistration, Long> {
        UserRegistration findByUsername(String username);
    }
