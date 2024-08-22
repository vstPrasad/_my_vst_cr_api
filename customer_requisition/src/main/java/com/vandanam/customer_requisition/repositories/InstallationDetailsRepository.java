package com.vandanam.customer_requisition.repositories;

import com.vandanam.customer_requisition.models.InstallationDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstallationDetailsRepository extends JpaRepository<InstallationDetails, Long> {
}
