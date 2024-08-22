package com.vandanam.customer_requisition.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class VillageDto {

    private Long id;
    private Integer code;
    private String nameEn;
    private String nameMr;
    private Integer talukaCode;
}