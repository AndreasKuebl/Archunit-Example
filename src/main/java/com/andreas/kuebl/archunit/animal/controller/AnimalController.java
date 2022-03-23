package com.andreas.kuebl.archunit.animal.controller;

import com.andreas.kuebl.archunit.animal.domain.Animal;
import com.andreas.kuebl.archunit.animal.dto.AnimalDto;
import com.andreas.kuebl.archunit.animal.mapper.AnimalMapper;
import com.andreas.kuebl.archunit.animal.service.AnimalService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

/**
 * @author Andreas Kuebl
 * @since 21.03.22
 *
 * Mapper between request related things and domain.
 */
@AllArgsConstructor
@Component
@Log4j2
public class AnimalController {

    private final AnimalService animalService;
    private final AnimalMapper animalMapper;

    public AnimalDto getAnimalById(Long id) {
        log.info("Get animal with {}", id);
        Animal animal = animalService.getAnimalById(id);
        return animalMapper.toDto(animal);
    }
}
