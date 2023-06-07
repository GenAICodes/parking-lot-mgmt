
    package com.parking.mgmt.service;
    import com.parking.mgmt.model.UserRegistration;
    import com.parking.mgmt.model.UserVerification;
    import com.parking.mgmt.model.RewardPoints;
    import com.parking.mgmt.repository.UserRepository;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Service;
    
    @Service
    public class UserServiceImpl implements UserService {
        @Autowired
        private UserRepository userRepository;
        
        @Override
        public UserRegistration registerUser(UserRegistration userRegistration) {
            userRegistration.setCreatedAt(new Timestamp(System.currentTimeMillis()));
            return userRepository.save(userRegistration);
        }
        
        @Override
        public UserVerification verifyUser(Long userId, String verificationCode) {
            // implementation omitted for brevity
        }
        
        @Override
        public RewardPoints addRewardPoints(Long userId, Integer points) {
            // implementation omitted for brevity
        }
        
        @Override
        public UserRegistration getUserById(Long userId) {
            return userRepository.findById(userId).orElse(null);
        }
    }
