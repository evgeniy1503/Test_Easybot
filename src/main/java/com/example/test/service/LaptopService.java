package com.example.test.service;

import com.example.test.dto.HardDriveDto;
import com.example.test.dto.LaptopDto;
import com.example.test.model.HardDrive;
import com.example.test.model.Laptop;

import java.util.List;
import java.util.Optional;

public interface LaptopService {

    Laptop create(LaptopDto laptopDto);
    Laptop update(LaptopDto laptopDto, String serialNumber);
    List<Laptop> getAll();
    Optional<Laptop> getById(String serialNumber);
}
