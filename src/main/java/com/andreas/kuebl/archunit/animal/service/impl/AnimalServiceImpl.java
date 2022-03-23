package com.andreas.kuebl.archunit.animal.service.impl;

import com.andreas.kuebl.archunit.animal.domain.Animal;
import com.andreas.kuebl.archunit.animal.repository.AnimalMockRepository;
import com.andreas.kuebl.archunit.animal.service.AnimalService;
import com.andreas.kuebl.archunit.animal.error.AnimalException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author Andreas Kuebl
 * @since 21.03.22
 */
@Service
@AllArgsConstructor
public class AnimalServiceImpl implements AnimalService {

    private final AnimalMockRepository animalMockRepository;

    @Override
    public Animal getAnimalById(Long id) {
        return animalMockRepository.getAnimalById(id);
    }

    private Animal createChild(Animal mother, Animal father) {
        throw new AnimalException("Can not create child, because it is to complex");
    }
}
