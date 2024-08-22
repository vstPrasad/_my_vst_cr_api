package com.vandanam.customer_requisition.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class RepresentativeDTO {
    private String representativeCode;
    private String name;
    private String mobile;
    private String email;
    private String password;
    private Integer addressPlaceId;
    private String placeType;
    private String placeNumber;
    private Integer educationalCredits;
    private LocalDate dob;
    private Integer yearsOfExperience;
    private Boolean isActive;
}
