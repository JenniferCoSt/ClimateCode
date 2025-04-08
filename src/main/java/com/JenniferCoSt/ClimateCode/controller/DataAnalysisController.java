package com.JenniferCoSt.ClimateCode.controller;

import com.JenniferCoSt.ClimateCode.service.DataAnalysisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/dataanalysis")
public class DataAnalysisController {

    private final DataAnalysisService dataAnalysisService;

    @Autowired
    public DataAnalysisController(DataAnalysisService dataAnalysisService) {
        this.dataAnalysisService = dataAnalysisService;
    }

    //Shell
    @GetMapping
    public DataAnalysisService getDataAnalysisService() {
        return dataAnalysisService;
    }
}
