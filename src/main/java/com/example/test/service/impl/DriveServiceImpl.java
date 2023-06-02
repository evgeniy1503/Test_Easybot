package com.example.test.service.impl;

import com.example.test.dto.HardDriveDto;
import com.example.test.model.DesktopComputer;
import com.example.test.model.HardDrive;
import com.example.test.repository.DesktopRepository;
import com.example.test.repository.DriveRepository;
import com.example.test.service.DriveService;
import com.example.test.utils.mapping.Mappers;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class DriveServiceImpl implements DriveService {

    private final DriveRepository driveRepository;

    private final Mappers mappers;

    @Override
    public HardDrive create(HardDriveDto hardDriveDto) {
        HardDrive hardDrive = driveRepository.findDesktopComputerBySerialNumber(hardDriveDto.getSerialNumber());
        if (hardDrive != null) {
            return hardDrive;
        }
        hardDrive = mappers.toHardDrive(hardDriveDto);
        return driveRepository.save(hardDrive);
    }

    @Override
    public HardDrive update(HardDriveDto hardDriveDto, String serialNumber) {
        HardDrive updateHardDrive = driveRepository.findById(serialNumber).orElseThrow();
        HardDrive hardDrive = mappers.updateHardDrive(hardDriveDto, updateHardDrive);
        return driveRepository.save(hardDrive);
    }

    @Override
    public List<HardDrive> getAll() {
       return driveRepository.findAll();
    }

    @Override
    public Optional<HardDrive> getById(String serialNumber) {
        return driveRepository.findById(serialNumber);
    }
}
