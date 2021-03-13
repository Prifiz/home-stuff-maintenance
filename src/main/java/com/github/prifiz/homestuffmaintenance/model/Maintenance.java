package com.github.prifiz.homestuffmaintenance.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Data
@Builder
@Entity
@Table(name = "maintenance")
public class Maintenance {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private final UUID id;

    private final UUID homeStuffId;
    private final Date lastServiceDate;
    private final Integer servicePeriodDays;
}
