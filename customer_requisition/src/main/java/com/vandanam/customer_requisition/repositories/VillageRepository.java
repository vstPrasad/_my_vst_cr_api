package com.vandanam.customer_requisition.repositories;

import com.vandanam.customer_requisition.models.Village;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VillageRepository extends JpaRepository<Village, Long> {
    List<Village> findByTalukaCode(Integer talukaCode);
}
