package com.vandanam.customer_requisition.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "villages")
@Data
@NoArgsConstructor
public class Village {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer code;
    private String nameEn;
    private String nameMr;
    private Integer talukaCode;
}