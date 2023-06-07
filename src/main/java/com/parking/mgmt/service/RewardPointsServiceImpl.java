
    package com.parking.mgmt.service;
    import com.parking.mgmt.model.RewardPoints;
    import com.parking.mgmt.repository.RewardPointsRepository;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Service;
    
    @Service
    public class RewardPointsServiceImpl implements RewardPointsService {
        @Autowired
        private RewardPointsRepository rewardPointsRepository;
        
        @Override
        public RewardPoints getRewardPointsByUserId(Long userId) {
            return rewardPointsRepository.findByUserId(userId);
        }
    }
