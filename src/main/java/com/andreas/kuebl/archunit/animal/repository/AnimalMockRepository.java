package com.andreas.kuebl.archunit.animal.repository;

import com.andreas.kuebl.archunit.animal.domain.Animal;

/**
 * @author Andreas Kuebl
 * @since 21.03.22
 */
public interface AnimalMockRepository {

    Animal getAnimalById(Long id);
}
