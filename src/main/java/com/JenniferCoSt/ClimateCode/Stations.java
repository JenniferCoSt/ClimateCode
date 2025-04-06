package com.JenniferCoSt.ClimateCode;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Stations {

    @Id
    private long id;
    private String stationName;
    private int stationCode;
    private String location;
    private String dataSource;
    private float metersAboveSeaLevel;


    public Stations() {}

    public Stations(int id, String stationName, int stationCode, String location, String dataSource, float metersAboveSeaLevel) {
        this.id = id;
        this.stationName = stationName;
        this.stationCode = stationCode;
        this.location = location;
        this.dataSource = dataSource;
        this.metersAboveSeaLevel = metersAboveSeaLevel;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
