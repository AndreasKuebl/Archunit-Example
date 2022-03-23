package com.andreas.kuebl.archunit.animal.repository.impl;

import com.andreas.kuebl.archunit.animal.domain.Animal;
import com.andreas.kuebl.archunit.animal.repository.AnimalMockRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.Random;

/**
 * @author Andreas Kuebl
 * @since 21.03.22
 *
 * Mock repository for the animals.
 */
@Repository
public class AnimalMockRepositoryImpl implements AnimalMockRepository {
    @Override
    public Animal getAnimalById(Long id) {
        return Animal.builder()
                .id(new Random().nextLong())
                .name("cat")
                .createdAt(LocalDateTime.now())
                .updatedAt(LocalDateTime.now())
                .age(10)
                .build();
    }
}
