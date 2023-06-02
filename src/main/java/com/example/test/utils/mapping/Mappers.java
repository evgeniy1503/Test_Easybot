package com.example.test.utils.mapping;

import com.example.test.dto.DesktopDto;
import com.example.test.dto.HardDriveDto;
import com.example.test.dto.LaptopDto;
import com.example.test.dto.MonitorDto;
import com.example.test.model.DesktopComputer;
import com.example.test.model.HardDrive;
import com.example.test.model.Laptop;
import com.example.test.model.Monitor;
import org.springframework.stereotype.Component;

@Component
public class Mappers {

    public DesktopComputer toDesktop(DesktopDto desktopDto) {
        DesktopComputer desktopComputer = new DesktopComputer();
        desktopComputer.setSerialNumber(desktopDto.getSerialNumber());
        desktopComputer.setCount(desktopDto.getCount());
        desktopComputer.setPrice(desktopDto.getPrice());
        desktopComputer.setManufacturer(desktopDto.getManufacturer());
        desktopComputer.setFormFactor(desktopDto.getFormFactor());
        return desktopComputer;
    }

    public DesktopComputer updateDesktop(DesktopDto desktopDto, DesktopComputer desktopComputer) {
        if (desktopDto.getSerialNumber() != null) {
            desktopComputer.setSerialNumber(desktopDto.getSerialNumber());
        }
        if (desktopDto.getCount() != null) {
            desktopComputer.setCount(desktopDto.getCount());
        }
        if (desktopDto.getPrice() != null) {
            desktopComputer.setPrice(desktopDto.getPrice());
        }
        if (desktopDto.getManufacturer() != null) {
            desktopComputer.setManufacturer(desktopDto.getManufacturer());
        }
        if (desktopDto.getFormFactor() != null) {
            desktopComputer.setFormFactor(desktopDto.getFormFactor());
        }
        return desktopComputer;
    }

    public HardDrive toHardDrive(HardDriveDto hardDriveDto) {
        HardDrive hardDrive = new HardDrive();
        hardDrive.setSerialNumber(hardDriveDto.getSerialNumber());
        hardDrive.setCount(hardDriveDto.getCount());
        hardDrive.setPrice(hardDriveDto.getPrice());
        hardDrive.setManufacturer(hardDriveDto.getManufacturer());
        hardDrive.setVolume(hardDriveDto.getVolume());
        return hardDrive;
    }

    public HardDrive updateHardDrive(HardDriveDto hardDriveDto, HardDrive hardDrive) {
        if (hardDriveDto.getSerialNumber() != null) {
            hardDrive.setSerialNumber(hardDriveDto.getSerialNumber());
        }
        if (hardDriveDto.getCount() != null) {
            hardDrive.setCount(hardDriveDto.getCount());
        }
        if (hardDriveDto.getPrice() != null) {
            hardDrive.setPrice(hardDriveDto.getPrice());
        }
        if (hardDriveDto.getManufacturer() != null) {
            hardDrive.setManufacturer(hardDriveDto.getManufacturer());
        }
        if (hardDriveDto.getVolume() != null) {
            hardDrive.setVolume(hardDriveDto.getVolume());
        }
        return hardDrive;
    }

    public Laptop toLaptop(LaptopDto laptopDto) {
        Laptop laptop = new Laptop();
        laptop.setSerialNumber(laptopDto.getSerialNumber());
        laptop.setCount(laptopDto.getCount());
        laptop.setPrice(laptopDto.getPrice());
        laptop.setManufacturer(laptopDto.getManufacturer());
        laptop.setLaptopSize(laptopDto.getLaptopSize());
        return laptop;
    }

    public Laptop updateLaptop(LaptopDto laptopDto, Laptop laptop) {
        if (laptopDto.getSerialNumber() != null) {
            laptop.setSerialNumber(laptopDto.getSerialNumber());
        }
        if (laptopDto.getCount() != null) {
            laptop.setCount(laptopDto.getCount());
        }
        if (laptopDto.getPrice() != null) {
            laptop.setPrice(laptopDto.getPrice());
        }
        if (laptopDto.getManufacturer() != null) {
            laptop.setManufacturer(laptopDto.getManufacturer());
        }
        if (laptopDto.getLaptopSize() != null) {
            laptop.setLaptopSize(laptopDto.getLaptopSize());
        }
        return laptop;
    }

    public Monitor toMonitor(MonitorDto monitorDto) {
        Monitor monitor = new Monitor();
        monitor.setSerialNumber(monitorDto.getSerialNumber());
        monitor.setCount(monitorDto.getCount());
        monitor.setPrice(monitorDto.getPrice());
        monitor.setManufacturer(monitorDto.getManufacturer());
        monitor.setDiagonal(monitorDto.getDiagonal());
        return monitor;
    }

    public Monitor updateMonitor(MonitorDto monitorDto, Monitor monitor) {
        if (monitorDto.getSerialNumber() != null) {
            monitor.setSerialNumber(monitorDto.getSerialNumber());
        }
        if (monitorDto.getCount() != null) {
            monitor.setCount(monitorDto.getCount());
        }
        if (monitorDto.getPrice() != null) {
            monitor.setPrice(monitorDto.getPrice());
        }
        if (monitorDto.getManufacturer() != null) {
            monitor.setManufacturer(monitorDto.getManufacturer());
        }
        if (monitorDto.getDiagonal() != null) {
            monitor.setDiagonal(monitorDto.getDiagonal());
        }
        return monitor;
    }

}
