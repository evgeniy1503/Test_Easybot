package com.example.test.repository;

import com.example.test.model.HardDrive;
import com.example.test.model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaptopRepository extends JpaRepository<Laptop, String> {

    Laptop findDesktopComputerBySerialNumber(String serialNumber);
}
