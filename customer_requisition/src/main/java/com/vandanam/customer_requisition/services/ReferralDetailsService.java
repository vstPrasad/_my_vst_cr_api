package com.vandanam.customer_requisition.services;

import com.vandanam.customer_requisition.models.ReferralDetails;
import com.vandanam.customer_requisition.repositories.ReferralDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReferralDetailsService {

    @Autowired
    private ReferralDetailsRepository referralDetailsRepository;

    public ReferralDetails saveReferralDetails(ReferralDetails referralDetails) {
        return referralDetailsRepository.save(referralDetails);
    }

    public ReferralDetails getReferralDetailsById(String id) {
        return referralDetailsRepository.findById(id).orElse(null);
    }

    public List<ReferralDetails> getAllReferralDetails() {
        return referralDetailsRepository.findAll();
    }

    public void deleteReferralDetails(String id) {
        ReferralDetails r=referralDetailsRepository.findById(id).get();

    }
}
