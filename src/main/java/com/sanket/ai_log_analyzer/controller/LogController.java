package com.sanket.ai_log_analyzer.controller;

import com.sanket.ai_log_analyzer.service.LogAnalyzerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/log")
public class LogController {

    @Autowired
    private LogAnalyzerService service;

    @PostMapping("/analyze")
    public String analyze(@RequestBody String log) throws Exception {
        return service.analyzeLog(log);
    }
}