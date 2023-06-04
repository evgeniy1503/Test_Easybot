package com.example.test.service.impl;

import com.example.test.dto.MonitorDto;
import com.example.test.model.Monitor;
import com.example.test.repository.MonitorRepository;
import com.example.test.service.MonitorService;
import com.example.test.utils.Mappers;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@AllArgsConstructor
public class MonitorServiceImpl implements MonitorService {

    private final MonitorRepository monitorRepository;

    private final Mappers mappers;

    @Override
    public Monitor create(MonitorDto monitorDto) {
        Monitor monitor = monitorRepository.findDesktopComputerBySerialNumber(monitorDto.getSerialNumber());
        if (monitor != null) {
            return monitor;
        }
        monitor = mappers.toMonitor(monitorDto);
        return monitorRepository.save(monitor);
    }

    @Override
    public Monitor update(MonitorDto monitorDto, String serialNumber) {
        Monitor updateMonitor = monitorRepository.findById(serialNumber).orElseThrow();
        Monitor monitor = mappers.updateMonitor(monitorDto, updateMonitor);
        return monitorRepository.save(monitor);
    }

    @Override
    public List<Monitor> getAll() {
        return monitorRepository.findAll();
    }

    @Override
    public Optional<Monitor> getById(String serialNumber) {
        return monitorRepository.findById(serialNumber);
    }
}
