package com.example.test.service;

import com.example.test.dto.DesktopDto;
import com.example.test.model.DesktopComputer;

import java.util.List;

public interface DesktopService {

    DesktopComputer create(DesktopDto desktopDto);
    DesktopComputer update(DesktopDto desktopDto, Long id);
    List<DesktopComputer> getAll();
    DesktopComputer getById(Long id);

}
