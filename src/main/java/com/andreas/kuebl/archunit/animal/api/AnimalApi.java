package com.andreas.kuebl.archunit.animal.api;

import com.andreas.kuebl.archunit.animal.controller.AnimalController;
import com.andreas.kuebl.archunit.animal.dto.AnimalDto;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * @author Andreas Kuebl
 * @since 21.03.22
 *
 * Endpoint definitions for the animals.
 */
@RestController
@RequestMapping("/")
@AllArgsConstructor
@Validated
public class AnimalApi {

    private final AnimalController animalController;

    @GetMapping("{id}")
    public ResponseEntity<AnimalDto> getAnimalById(@PathVariable("id") @Min(1) @Max(Long.MAX_VALUE) Long id) {
        return ResponseEntity.ok(animalController.getAnimalById(id));
    }
}
