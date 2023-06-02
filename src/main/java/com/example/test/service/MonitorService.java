package com.example.test.service;

import com.example.test.dto.LaptopDto;
import com.example.test.dto.MonitorDto;
import com.example.test.model.Laptop;
import com.example.test.model.Monitor;

import java.util.List;
import java.util.Optional;

public interface MonitorService {

    Monitor create(MonitorDto monitorDto);

    Monitor update(MonitorDto monitorDto, String serialNumber);

    List<Monitor> getAll();

    Optional<Monitor> getById(String serialNumber);

}
