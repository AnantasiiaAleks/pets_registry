package Model.HomeAnimals;

import Model.AnimalTitle;

import java.time.LocalDate;

public class Hamster extends HomeAnimal{
    public Hamster(String name, LocalDate birthDate) {
        super(name, birthDate);
        AnimalTitle animalTitle = AnimalTitle.HAMSTER;
    }
}
