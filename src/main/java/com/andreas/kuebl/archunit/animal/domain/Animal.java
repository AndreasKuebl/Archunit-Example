package com.andreas.kuebl.archunit.animal.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDateTime;

/**
 * @author Andreas Kuebl
 * @since 21.03.22
 */

@Getter
@Builder
@ToString
public class Animal {
    private Long id;
    private String name;
    private Integer age;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    // Add some more properties
}
