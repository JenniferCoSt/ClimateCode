package com.JenniferCoSt.ClimateCode.service;

import com.JenniferCoSt.ClimateCode.model.Station;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Stack;

@Service
public class StationService {

    public List<Station> getAllStations() {

        return List.of();
    }

    public Station getStation() {

        return new Station();
    }
}
