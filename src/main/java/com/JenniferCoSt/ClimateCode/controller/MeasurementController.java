package com.JenniferCoSt.ClimateCode.controller;

import com.JenniferCoSt.ClimateCode.model.Measurement;
import com.JenniferCoSt.ClimateCode.service.MeasurementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/measurements")
public class MeasurementController {

    private final MeasurementService measurementService;

    @Autowired
    public MeasurementController(MeasurementService measurementService) {
        this.measurementService = measurementService;
    }

    @GetMapping
    public List<Measurement> getAllMeasurements() {

        return measurementService.getAllMeasurements();
    }

}
