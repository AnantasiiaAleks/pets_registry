package Model.PackAnimal;

import Model.AnimalTitle;

import java.time.LocalDate;

public class Horse extends PackAnimal{
    public Horse(String name, LocalDate birthDate) {
        super(name, birthDate);
        AnimalTitle animalTitle = AnimalTitle.HORSE;
    }
}
