package com.JenniferCoSt.ClimateCode;

import jakarta.persistence.*;

@Entity(name = "Stations")
@Table(name = "Stations")
public class Stations {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(
            name = "id",
            updatable = false
    )
    private long id;

    @Column(
            name = "stationName"
    )
    private String stationName;

    @Column(
            name = "stationCode"
    )
    private int stationCode;

    @Column(
            name = "location",
            nullable = false
    )
    private String location;

    @Column(
            name = "dataSource",
            nullable = false
    )
    private String dataSource;

    @Column(
            name = "metersAboveSeaLevel"
    )
    private float metersAboveSeaLevel;


    public Stations() {}

    public Stations(String stationName, int stationCode, String location, String dataSource, float metersAboveSeaLevel) {
        this.stationName = stationName;
        this.stationCode = stationCode;
        this.location = location;
        this.dataSource = dataSource;
        this.metersAboveSeaLevel = metersAboveSeaLevel;
    }

    public long getId() {
        return id;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public int getStationCode() {
        return stationCode;
    }

    public void setStationCode(int stationCode) {
        this.stationCode = stationCode;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    public float getMetersAboveSeaLevel() {
        return metersAboveSeaLevel;
    }

    public void setMetersAboveSeaLevel(float metersAboveSeaLevel) {
        this.metersAboveSeaLevel = metersAboveSeaLevel;
    }
}
