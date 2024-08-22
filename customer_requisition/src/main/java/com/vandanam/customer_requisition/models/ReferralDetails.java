package com.vandanam.customer_requisition.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name="referral_details")
public class ReferralDetails {

    @Id
    private String referralCode;

}
