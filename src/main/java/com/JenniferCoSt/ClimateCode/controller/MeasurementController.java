package com.JenniferCoSt.ClimateCode.controller;

import com.JenniferCoSt.ClimateCode.model.Measurement;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MeasurementController {

    @GetMapping("/stations")
    public List<Measurement> getMeasurements() {

        return List.of();
    }

}
