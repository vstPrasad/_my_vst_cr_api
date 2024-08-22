package com.vandanam.customer_requisition.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
public class InstallationDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long installationId;

    @ManyToOne
    @JoinColumn(name = "consumer_id", referencedColumnName = "consumerId")
    private ConnectionDetails connectionDetails;

    private String installableSpaceType;
    private Double availableSpaceSqFt;
    private Boolean isPreferredSpace;
    private Boolean isActive;
    private LocalDateTime dateCreated;
    private LocalDateTime dateUpdated;


}
