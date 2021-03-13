package com.github.prifiz.homestuffmaintenance.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Data
@Entity
@Table(name = "home_stuff")
public class HomeStuff {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private final UUID id;

    private final Date buyDate;
    private final Date manufacturingDate;
    private final Date guaranteeExpirationDate;
}
