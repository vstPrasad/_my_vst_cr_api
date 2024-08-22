package com.vandanam.customer_requisition.repositories;

import com.vandanam.customer_requisition.models.ConnectionDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConnectionRepository extends JpaRepository<ConnectionDetails, String> {
}