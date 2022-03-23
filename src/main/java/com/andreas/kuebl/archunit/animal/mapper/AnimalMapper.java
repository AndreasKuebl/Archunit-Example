package com.andreas.kuebl.archunit.animal.mapper;

import com.andreas.kuebl.archunit.animal.domain.Animal;
import com.andreas.kuebl.archunit.animal.dto.AnimalDto;
import org.mapstruct.Mapper;

/**
 * @author Andreas Kuebl
 * @since 21.03.22
 */
@Mapper
public interface AnimalMapper {

    AnimalDto toDto(Animal animal);
}
