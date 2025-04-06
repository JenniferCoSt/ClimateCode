package com.JenniferCoSt.ClimateCode;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "MeasurementParameters")
@Table(name = "MeasurementParameters")
public class MeasurementParameters {

    @Id
    @Column(
            name = "id",
            updatable = false
    )
    private int id;

    @Column(
            name = "parameterType",
            nullable = false
    )
    private String parameterType;

    @Column(
            name = "unit",
            nullable = false
    )
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
