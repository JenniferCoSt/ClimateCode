package com.JenniferCoSt.ClimateCode.controller;

import com.JenniferCoSt.ClimateCode.model.Station;
import com.JenniferCoSt.ClimateCode.service.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StationController {

    private final StationService stationService;

    @Autowired
    public StationController(StationService stationService) {
        this.stationService = stationService;
    }

    @GetMapping("/stations")
    public List<Station> getStations() {

        return stationService.getStations();
    }

}
