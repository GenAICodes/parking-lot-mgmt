
    package com.parking.mgmt.service;
    import com.parking.mgmt.model.UserRegistration;
    import com.parking.mgmt.model.UserVerification;
    import com.parking.mgmt.model.RewardPoints;
    
    public interface UserService {
        UserRegistration registerUser(UserRegistration userRegistration);
        UserVerification verifyUser(Long userId, String verificationCode);
        RewardPoints addRewardPoints(Long userId, Integer points);
        UserRegistration getUserById(Long userId);
        void deleteUser(Long userId);
    }
