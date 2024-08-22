package com.vandanam.customer_requisition.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DistrictDto {

    private Long id;
    private Integer code;
    private String nameEn;
    private String nameMr;
    private Integer stateCode;
}