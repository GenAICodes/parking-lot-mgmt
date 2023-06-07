
    package com.parking.mgmt.service;
    import com.parking.mgmt.model.UserVerification;
    import com.parking.mgmt.repository.UserVerificationRepository;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Service;
    
    @Service
    public class UserVerificationServiceImpl implements UserVerificationService {
        @Autowired
        private UserVerificationRepository userVerificationRepository;
        
        @Override
        public UserVerification getUserVerificationByUserId(Long userId) {
            return userVerificationRepository.findByUserId(userId);
        }
    }
