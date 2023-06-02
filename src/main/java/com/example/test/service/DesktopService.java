package com.example.test.service;

import com.example.test.dto.DesktopDto;
import com.example.test.model.DesktopComputer;

import java.util.List;
import java.util.Optional;

public interface DesktopService {

    DesktopComputer create(DesktopDto desktopDto);
    DesktopComputer update(DesktopDto desktopDto, String serialNumber);
    List<DesktopComputer> getAll();
    Optional<DesktopComputer> getById(String serialNumber);

}
