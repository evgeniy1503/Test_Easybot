package com.example.test.controller;

import com.example.test.dto.HardDriveDto;
import com.example.test.model.HardDrive;
import com.example.test.service.DriveService;
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
@RequestMapping("/drive")
public class DriveController {

    private final DriveService driveService;

    @GetMapping("/")
    public List<HardDrive> getAll() {
        return driveService.getAll();
    }

    @GetMapping("/{serialNumber}")
    public HardDrive getBySerialNumber(@PathVariable String serialNumber) {
        return driveService.getById(serialNumber).get();
    }

    @PostMapping("/")
    public HardDrive create(@RequestBody HardDriveDto hardDriveDto) {
        return driveService.create(hardDriveDto);
    }

    @PutMapping("/{serialNumber}")
    public HardDrive update(@RequestBody HardDriveDto hardDriveDto, @PathVariable String serialNumber) {
        return driveService.update(hardDriveDto, serialNumber);
    }
}
