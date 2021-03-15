package com.github.prifiz.homestuffmaintenance.web.request;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor(onConstructor_={@JsonCreator(mode = JsonCreator.Mode.PROPERTIES)})
public class CreateHomeStuffRequest {

    private String name;
    private String manufacturer;
    private String model;

    private LocalDate buyDate;
    private LocalDate manufacturingDate;
    private LocalDate guaranteeExpirationDate;
}
