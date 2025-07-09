package com.nickolss.argus_api.controllers;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.nickolss.argus_api.models.Log;
import com.nickolss.argus_api.models.LogRequestDto;
import com.nickolss.argus_api.services.LogService;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/v1")
@Tag(name = "Log", description = "Endpoint to manage logs.")
public class LogController {
    private LogService logService;

    public LogController(LogService logService){
        this.logService = logService;
    }

    @GetMapping
    public List<Log> findAll() {
        return logService.findAll();
    }

    @GetMapping("{id}")
    public Log findById(@PathVariable Long id) {
        return logService.findById(id);
    }

    @PostMapping
    public Log create(@RequestBody LogRequestDto log) {
        return logService.create(log);
    }
}