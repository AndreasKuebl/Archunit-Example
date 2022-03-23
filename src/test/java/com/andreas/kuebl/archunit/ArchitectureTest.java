package com.andreas.kuebl.archunit;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.library.Architectures;
import org.junit.jupiter.api.Test;

import static com.tngtech.archunit.library.Architectures.layeredArchitecture;

/**
 * @author Andreas Kuebl
 * @since 21.03.22
 */
public class ArchitectureTest {

    @Test
    public void test_architecture_layer() {
        JavaClasses projectClasses = new ClassFileImporter()
//                .withImportOption(new ImportOption.DoNotIncludeTests())
                .importPackages("com.andreas.kuebl.archunit");

        Architectures.LayeredArchitecture layeredArchitecture = layeredArchitecture()
                .layer("Api").definedBy("..api..")
                .layer("Config").definedBy("..config..")
                .layer("Controller").definedBy("..controller..")
                .layer("Domain").definedBy("..domain..")
                .layer("Dto").definedBy("..dto..")
                .layer("Mapper").definedBy("..mapper..")
                .layer("Repository").definedBy("..repository..")
                .layer("Service").definedBy("..service..")
                .layer("Error").definedBy("..error..")
                .whereLayer("Api").mayNotBeAccessedByAnyLayer()
                .whereLayer("Config").mayNotBeAccessedByAnyLayer()
                .whereLayer("Controller").mayOnlyBeAccessedByLayers("Api")
                .whereLayer("Domain").mayOnlyBeAccessedByLayers("Controller", "Domain", "Mapper", "Repository", "Service")
                .whereLayer("Dto").mayOnlyBeAccessedByLayers("Api", "Controller", "Mapper")
                .whereLayer("Mapper").mayOnlyBeAccessedByLayers("Controller", "Mapper")
                .whereLayer("Repository").mayOnlyBeAccessedByLayers("Service", "Repository")
                .whereLayer("Service").mayOnlyBeAccessedByLayers("Controller", "Service")
                .whereLayer("Error").mayOnlyBeAccessedByLayers("Controller", "Service", "Repository", "Controller");


        layeredArchitecture.check(projectClasses);
    }
}
