package com.vandanam.customer_requisition.repositories;

import com.vandanam.customer_requisition.models.ReferralDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReferralDetailsRepository extends JpaRepository<ReferralDetails, String> {
}