package com.example.test.controller;

import com.example.test.dto.HardDriveDto;
import com.example.test.dto.LaptopDto;
import com.example.test.model.HardDrive;
import com.example.test.model.Laptop;
import com.example.test.service.LaptopService;
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
@RequestMapping("/laptop")
public class LaptopController {

    private final LaptopService laptopService;

    @GetMapping("/")
    public List<Laptop> getAll() {
        return laptopService.getAll();
    }

    @GetMapping("/{serialNumber}")
    public Laptop getBySerialNumber(@PathVariable String serialNumber) {
        return laptopService.getById(serialNumber).get();
    }

    @PostMapping("/")
    public Laptop create(@RequestBody LaptopDto laptopDto) {
        return laptopService.create(laptopDto);
    }

    @PutMapping("/{serialNumber}")
    public Laptop update(@RequestBody LaptopDto laptopDto, @PathVariable String serialNumber) {
        return laptopService.update(laptopDto, serialNumber);
    }
}
