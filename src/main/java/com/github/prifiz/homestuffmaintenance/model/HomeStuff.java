package com.github.prifiz.homestuffmaintenance.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

@Data
@NoArgsConstructor
@Entity
@Table(name = "home_stuff")
public class HomeStuff {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private Long stuffId;

    private LocalDate buyDate;
    private LocalDate manufacturingDate;
    private LocalDate guaranteeExpirationDate;
}

