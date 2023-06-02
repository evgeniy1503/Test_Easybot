package com.example.test.utils.mapping;

import com.example.test.dto.DesktopDto;
import com.example.test.model.DesktopComputer;
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

}
