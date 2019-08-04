package com.cat;

import lombok.Data;

@Data
public class City {
    private Long id;

    private String name;

    private String countryCode;

    private String district;

    private Long population;
}
