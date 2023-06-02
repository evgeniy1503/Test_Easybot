package com.example.test.repository;

import com.example.test.model.DesktopComputer;
import com.example.test.model.HardDrive;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriveRepository extends JpaRepository<HardDrive, String> {
    HardDrive findDesktopComputerBySerialNumber(String serialNumber);
}
