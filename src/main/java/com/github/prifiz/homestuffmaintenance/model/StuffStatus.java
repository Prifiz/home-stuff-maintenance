package com.github.prifiz.homestuffmaintenance.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Data
@Entity
@Table(name = "stuff_status")
public class StuffStatus {

    @Id
    private final UUID id;
    private final String name;
}
