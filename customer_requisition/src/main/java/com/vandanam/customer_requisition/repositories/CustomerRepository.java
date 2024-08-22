package com.vandanam.customer_requisition.repositories;

import com.vandanam.customer_requisition.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public  interface CustomerRepository extends JpaRepository<Customer, String> {
}