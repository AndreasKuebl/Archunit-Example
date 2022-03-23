package com.andreas.kuebl.archunit.animal.mapper;

import com.andreas.kuebl.archunit.animal.domain.Animal;
import com.andreas.kuebl.archunit.animal.dto.AnimalDto;
import com.andreas.kuebl.archunit.animal.dto.AnimalDto.AnimalDtoBuilder;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-03-21T08:28:59+0100",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.4.1.jar, environment: Java 11.0.11 (AdoptOpenJDK)"
)
@Component
public class AnimalMapperImpl implements AnimalMapper {

    @Override
    public AnimalDto toDto(Animal animal) {
        if ( animal == null ) {
            return null;
        }

        AnimalDtoBuilder animalDto = AnimalDto.builder();

        animalDto.id( animal.getId() );
        animalDto.name( animal.getName() );
        animalDto.age( animal.getAge() );

        return animalDto.build();
    }
}
