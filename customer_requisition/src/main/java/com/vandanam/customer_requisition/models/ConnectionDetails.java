package com.vandanam.customer_requisition.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
@Data
@Entity
public class ConnectionDetails {

    @Id
    private String consumerId;

    private Integer addressPlaceId;
    private String addressType;
    private String addressLine1;
    private String addressLine2;
    private String postalCode;

    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "customerId")
    private Customer customer;

    private String connectionType;
    private Double monthlyAvgConsumptionUnits;
    private Boolean isActive;
    private LocalDateTime dateCreated;
    private LocalDateTime dateUpdated;


}
