package com.JenniferCoSt.ClimateCode.service;

import com.JenniferCoSt.ClimateCode.model.Station;
import com.JenniferCoSt.ClimateCode.repository.StationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Stack;

@Service
public class StationService {

    private final StationRepository stationRepository;

    @Autowired
    public StationService(StationRepository stationRepository) {
        this.stationRepository = stationRepository;
    }

    public List<Station> getAllStations() {
        return stationRepository.findAll();
    }

    public Station getStation(long stationId) {
        return stationRepository.getReferenceById(stationId);
    }
}
