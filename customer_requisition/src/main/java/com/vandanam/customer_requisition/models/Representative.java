package com.vandanam.customer_requisition.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity(name="representatives")
@Data
@NoArgsConstructor
public class Representative {

    @Id
    private String representativeCode;

    private String name;
    private String mobile;
    private String email;
    private Integer addressPlaceId;
    private String placeType;
    private String placeNumber;
    private Integer educationalCredits;
    private LocalDate dob;
    private Integer yearsOfExperience;

    @ManyToOne
    @JoinColumn(name = "referral_code", referencedColumnName = "referralCode", insertable = false, updatable = false)
    private ReferralDetails referralDetails;

    private Boolean isActive;
    private String password;
    private LocalDateTime dateCreated;
    private LocalDateTime dateUpdated;
}
