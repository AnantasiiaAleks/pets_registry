package Model;

import java.time.LocalDate;

public record AnimalInfo(AnimalType animalType,
                         AnimalTitle animalTitle,
                         String name,
                         LocalDate birthDate) {
}
