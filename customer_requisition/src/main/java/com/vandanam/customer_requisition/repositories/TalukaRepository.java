package com.vandanam.customer_requisition.repositories;

import com.vandanam.customer_requisition.models.Taluka;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TalukaRepository extends JpaRepository<Taluka, Long> {
    List<Taluka> findByDistrictCode(Integer districtCode);
}
