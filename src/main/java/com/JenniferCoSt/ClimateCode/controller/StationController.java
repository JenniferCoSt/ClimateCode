package com.JenniferCoSt.ClimateCode.controller;

import com.JenniferCoSt.ClimateCode.model.Station;
import com.JenniferCoSt.ClimateCode.service.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/stations")
public class StationController {

    private final StationService stationService;

    @Autowired
    public StationController(StationService stationService) {
        this.stationService = stationService;
    }

    @GetMapping
    public List<Station> getAllStations() {

        return stationService.getAllStations();
    }

    @GetMapping("/{id}")
    public Station getStation(Long id) {

        return stationService.getStation();
    }

}
