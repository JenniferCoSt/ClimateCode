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


    public Stations() {}

    public Stations(int id, String stationName, String stationCode, String location, String dataSource, int metersAboveSeaLevel) {
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

    public String getStationCode() {
        return stationCode;
    }

    public void setStationCode(String stationCode) {
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

    public int getMetersAboveSeaLevel() {
        return metersAboveSeaLevel;
    }

    public void setMetersAboveSeaLevel(int metersAboveSeaLevel) {
        this.metersAboveSeaLevel = metersAboveSeaLevel;
    }
}
