package com.example.test.service.impl;

import com.example.test.dto.LaptopDto;
import com.example.test.model.Laptop;
import com.example.test.repository.LaptopRepository;
import com.example.test.service.LaptopService;
import com.example.test.utils.Mappers;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class LaptopServiceImpl implements LaptopService {

    private final LaptopRepository laptopRepository;

    private final Mappers mappers;

    @Override
    public Laptop create(LaptopDto laptopDto) {
        Laptop laptop = laptopRepository.findDesktopComputerBySerialNumber(laptopDto.getSerialNumber());
        if (laptop != null) {
            return laptop;
        }
        laptop = mappers.toLaptop(laptopDto);
        return laptopRepository.save(laptop);
    }

    @Override
    public Laptop update(LaptopDto laptopDto, String serialNumber) {
        Laptop updateLaptop = laptopRepository.findById(serialNumber).orElseThrow();
        Laptop laptop = mappers.updateLaptop(laptopDto, updateLaptop);
        return laptopRepository.save(laptop);
    }

    @Override
    public List<Laptop> getAll() {
        return laptopRepository.findAll();
    }

    @Override
    public Optional<Laptop> getById(String serialNumber) {
        return laptopRepository.findById(serialNumber);
    }
}
