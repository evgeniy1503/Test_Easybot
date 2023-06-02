package com.example.test.service.impl;

import com.example.test.dto.DesktopDto;
import com.example.test.model.DesktopComputer;
import com.example.test.repository.DesktopRepository;
import com.example.test.service.DesktopService;
import com.example.test.utils.mapping.Mappers;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class DesktopServiceImpl implements DesktopService {

    private final DesktopRepository desktopRepository;

    private final Mappers mappers;

    @Override
    public DesktopComputer create(DesktopDto desktopDto) {
        DesktopComputer desktop = desktopRepository.findDesktopComputerBySerialNumber(desktopDto.getSerialNumber());
        if (desktop != null) {
            return desktop;
        }
        desktop = mappers.toDesktop(desktopDto);
        return desktopRepository.save(desktop);
    }

    @Override
    public DesktopComputer update(DesktopDto desktopDto, String serialNumber) {
        DesktopComputer updateDesktop = desktopRepository.findById(serialNumber).orElseThrow();
        DesktopComputer desktopComputer = mappers.updateDesktop(desktopDto, updateDesktop);
        return desktopRepository.save(desktopComputer);
    }

    @Override
    public List<DesktopComputer> getAll() {
       return desktopRepository.findAll();
    }

    @Override
    public Optional<DesktopComputer> getById(String serialNumber) {
        return desktopRepository.findById(serialNumber);
    }
}
