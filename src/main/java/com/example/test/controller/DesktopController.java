package com.example.test.controller;

import com.example.test.dto.DesktopDto;
import com.example.test.model.DesktopComputer;
import com.example.test.service.DesktopService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/desktop")
public class DesktopController {

    private final DesktopService desktopService;

    @GetMapping("/")
    public List<DesktopComputer> getAll() {
        return desktopService.getAll();
    }

    @PostMapping("/")
    public DesktopComputer create(@RequestBody DesktopDto desktopDto) {
        return desktopService.create(desktopDto);
    }
}
