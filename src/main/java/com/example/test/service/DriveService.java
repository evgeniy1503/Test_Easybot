package com.example.test.service;

import com.example.test.dto.DesktopDto;
import com.example.test.dto.HardDriveDto;
import com.example.test.model.DesktopComputer;
import com.example.test.model.HardDrive;

import java.util.List;
import java.util.Optional;

public interface DriveService {

    HardDrive create(HardDriveDto hardDriveDto);
    HardDrive update(HardDriveDto hardDriveDto, String serialNumber);
    List<HardDrive> getAll();
    Optional<HardDrive> getById(String serialNumber);
}
