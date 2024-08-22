package com.vandanam.customer_requisition.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
@Data
@Entity
public class Customer {

    @Id
    private String customerId;

    private String name;
    private String mobile;
    private String email;

    @ManyToOne
    @JoinColumn(name = "referral_code", referencedColumnName = "referralCode")
    private ReferralDetails referralDetails;

    @ManyToOne
    @JoinColumn(name = "representative_code", referencedColumnName = "representativeCode")
    private Representative referredByRep;

    private Boolean isActive;
    private LocalDateTime dateCreated;
    private LocalDateTime dateUpdated;


}
