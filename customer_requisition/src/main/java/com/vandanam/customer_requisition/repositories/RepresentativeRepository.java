package com.vandanam.customer_requisition.repositories;

import com.vandanam.customer_requisition.models.Representative;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepresentativeRepository extends JpaRepository<Representative, String> {
    Representative findByEmail(String email);
}
