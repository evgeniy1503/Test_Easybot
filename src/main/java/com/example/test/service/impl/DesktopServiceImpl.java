package com.example.test.service.impl;

import com.example.test.dto.DesktopDto;
import com.example.test.model.DesktopComputer;
import com.example.test.repository.DesktopRepository;
import com.example.test.service.DesktopService;
import com.example.test.utils.mapping.Mappers;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
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
            desktop.setCount(desktop.getCount().add(desktopDto.getCount()));
            return desktopRepository.save(desktop);
        }
        desktop = mappers.toDesktop(desktopDto);
        return desktopRepository.save(desktop);
    }

    @Override
    public DesktopComputer update(DesktopDto desktopDto, Long id) {
        return null;
    }

    @Override
    public List<DesktopComputer> getAll() {
       return desktopRepository.findAll();
    }

    @Override
    public DesktopComputer getById(Long id) {
        return null;
    }
}
