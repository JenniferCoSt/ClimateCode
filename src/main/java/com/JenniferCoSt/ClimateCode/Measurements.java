package com.JenniferCoSt.ClimateCode;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity(name = "Measurements")
public class Measurements {

    @Id
    private long id;
    //Station-objekt - ändra
    private int stationId;
    //MeasurementParameter-objekt - ändra
    private int measurementParameterId;
    private LocalDate dataDate;
    private float dataValue;
    private String qualityCode;
    private String measurementType;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Instant registered;

    public Measurements() {}

    public Measurements(long id, int stationId, int measurementParameterId, LocalDate dataDate, float dataValue, String qualityCode, String measurementType, LocalDateTime startTime, LocalDateTime endTime, Instant registered) {
        this.id = id;
        this.stationId = stationId;
        this.measurementParameterId = measurementParameterId;
        this.dataDate = dataDate;
        this.dataValue = dataValue;
        this.qualityCode = qualityCode;
        this.measurementType = measurementType;
        this.startTime = startTime;
        this.endTime = endTime;
        this.registered = registered;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getStationId() {
        return stationId;
    }

    public void setStationId(int stationId) {
        this.stationId = stationId;
    }

    public int getMeasurementParameterId() {
        return measurementParameterId;
    }

    public void setMeasurementParameterId(int measurementParametersId) {
        this.measurementParameterId = measurementParametersId;
    }

    public LocalDate getDataDate() {
        return dataDate;
    }

    public void setDataDate(LocalDate dataDate) {
        this.dataDate = dataDate;
    }

    public float getDataValue() {
        return dataValue;
    }

    public void setDataValue(float dataValue) {
        this.dataValue = dataValue;
    }

    public String getQualityCode() {
        return qualityCode;
    }

    public void setQualityCode(String qualityCode) {
        this.qualityCode = qualityCode;
    }

    public String getMeasurementType() {
        return measurementType;
    }

    public void setMeasurementType(String measurementType) {
        this.measurementType = measurementType;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public Instant getRegistered() {
        return registered;
    }

    public void setRegistered(Instant registered) {
        this.registered = registered;
    }
}
