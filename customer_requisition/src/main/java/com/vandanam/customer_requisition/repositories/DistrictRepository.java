package com.vandanam.customer_requisition.repositories;

import com.vandanam.customer_requisition.models.District;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DistrictRepository extends JpaRepository<District, Long> {
    List<District> findByStateCode(Integer stateCode);
}
