package com.JenniferCoSt.ClimateCode.controller;

import com.JenniferCoSt.ClimateCode.service.DataAnalysisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataAnalysisController {

    private final DataAnalysisService dataAnalysisService;

    @Autowired
    public DataAnalysisController(DataAnalysisService dataAnalysisService) {
        this.dataAnalysisService = dataAnalysisService;
    }

    //Shell
    public DataAnalysisService getDataAnalysisService() {
        return dataAnalysisService;
    }
}
