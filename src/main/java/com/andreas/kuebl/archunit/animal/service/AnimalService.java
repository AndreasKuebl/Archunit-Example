package com.andreas.kuebl.archunit.animal.service;

import com.andreas.kuebl.archunit.animal.domain.Animal;

/**
 * @author Andreas Kuebl
 * @since 21.03.22
 */
public interface AnimalService {

    Animal getAnimalById(Long id);
}
