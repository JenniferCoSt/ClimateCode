package com.JenniferCoSt.ClimateCode;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class MeasurementParameters {

    @Id
    private int id;
    private String parameterType;
    private String unit;

    public MeasurementParameters() {}

    public MeasurementParameters(int id, String parameterType, String unit) {
        this.id = id;
        this.parameterType = parameterType;
        this.unit = unit;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getParameterType() {
        return parameterType;
    }

    public void setParameterType(String parameterType) {
        this.parameterType = parameterType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
