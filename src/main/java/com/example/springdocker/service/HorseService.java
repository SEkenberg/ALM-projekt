package com.example.springdocker.service;

import com.example.springdocker.model.Horse;
import com.example.springdocker.repository.HorseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class HorseService {
    private final HorseRepository repository;

    public List<Horse> getHorses() {
        return repository.findAll();
    }

    public void saveNewHorse(Horse horse) {
        repository.save(horse);
    }

    public List<String> getNeighHorses() {
        // hämtar alla Horses som kan gnegga
        List<Horse> neighHorses = repository.findHorseByNeigh(true);

        // returnerar endast Food namnen i en lista
        return neighHorses.stream()
                .map(horse -> horse.getName())
                .collect(Collectors.toList());
    }
}
