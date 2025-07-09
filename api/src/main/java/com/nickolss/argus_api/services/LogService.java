package com.nickolss.argus_api.services;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import org.springframework.stereotype.Service;
import com.nickolss.argus_api.models.Log;
import com.nickolss.argus_api.models.LogRequestDto;
import com.nickolss.argus_api.repositories.LogRepository;

@Service
public class LogService {
    private LogRepository logRepository;

    public LogService(LogRepository logRepository) {
        this.logRepository = logRepository;
    }

    public Log findById(Long id) {
        return logRepository.findById(id)
                .orElse(null);
    }

    public List<Log> findAll() {
        return logRepository.findAll();
    }

    public Log create(LogRequestDto request) {
        Log entity = new Log();
        entity.setUsername(request.getUsername());
        entity.setAction(request.getAction());
        entity.setStatus(request.getStatus());
        entity.setDate(LocalDate.now());
        entity.setTime(LocalTime.now());

        return logRepository.save(entity);
    }
}
