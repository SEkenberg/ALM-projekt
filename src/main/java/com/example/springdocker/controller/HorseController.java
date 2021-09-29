package com.example.springdocker.controller;

import com.example.springdocker.model.Horse;
import com.example.springdocker.service.HorseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class HorseController {
    private final HorseService service;

    @GetMapping("/horses")
    public List<Horse> getHorses() {
        return service.getHorses();
    }

    @PostMapping("/horses")
    public void saveNewHorse(@RequestBody Horse horse) {
        service.saveNewHorse(horse);
    }

    @GetMapping("/horses/neigh")
    public List<String> getNeighHorses() {
        return service.getNeighHorses();
    }
}
