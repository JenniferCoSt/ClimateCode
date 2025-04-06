package com.JenniferCoSt.ClimateCode;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Stations {

    @Id
    private long id;
    private String stationName;
    private String stationCode;
    private String location;
    private String dataSource;
    private int metersAboveSeaLevel;
}
