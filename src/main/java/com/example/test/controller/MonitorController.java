package com.example.test.controller;


import com.example.test.dto.LaptopDto;
import com.example.test.dto.MonitorDto;
import com.example.test.model.Laptop;
import com.example.test.model.Monitor;
import com.example.test.service.MonitorService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/monitor")
public class MonitorController {

    private final MonitorService monitorService;

    @GetMapping("/")
    public List<Monitor> getAll() {
        return monitorService.getAll();
    }

    @GetMapping("/{serialNumber}")
    public Monitor getBySerialNumber(@PathVariable String serialNumber) {
        return monitorService.getById(serialNumber).get();
    }

    @PostMapping("/")
    public Monitor create(@RequestBody MonitorDto laptopDto) {
        return monitorService.create(laptopDto);
    }

    @PutMapping("/{serialNumber}")
    public Monitor update(@RequestBody MonitorDto monitorDto, @PathVariable String serialNumber) {
        return monitorService.update(monitorDto, serialNumber);
    }
}
