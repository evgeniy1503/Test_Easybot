package com.example.test.repository;

import com.example.test.model.DesktopComputer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DesktopRepository extends JpaRepository<DesktopComputer, String> {

    DesktopComputer findDesktopComputerBySerialNumber(String serialNumber);
}
