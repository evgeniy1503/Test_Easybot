package com.example.test.repository;

import com.example.test.model.Laptop;
import com.example.test.model.Monitor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MonitorRepository extends JpaRepository<Monitor, String> {

    Monitor findDesktopComputerBySerialNumber(String serialNumber);

}
