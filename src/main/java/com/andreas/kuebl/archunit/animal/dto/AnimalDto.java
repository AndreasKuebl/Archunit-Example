package com.andreas.kuebl.archunit.animal.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * @author Andreas Kuebl
 * @since 21.03.22
 */
@Getter
@Builder
@ToString
@Valid
public class AnimalDto {

    @NotNull
    @Min(1)
    private Long id;

    @NotBlank
    @Size(max = 255)
    private String name;

    @Min(0)
    private Integer age;

    // Add some more properties
}
