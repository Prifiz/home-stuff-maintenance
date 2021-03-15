package com.github.prifiz.homestuffmaintenance.web.response;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
public class StuffResponse {

    private Long id;
    private String name;
    private String manufacturer;
    private String model;
    private String description;
}
