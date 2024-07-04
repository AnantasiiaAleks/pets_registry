package Controller;

import Model.Animal;
import Model.AnimalTitle;
import Model.AnimalType;
import Model.HomeAnimals.Cat;
import Model.HomeAnimals.Dog;
import Model.HomeAnimals.Hamster;
import Model.PackAnimal.Camel;
import Model.PackAnimal.Donkey;
import Model.PackAnimal.Horse;

import java.time.LocalDate;

public class AnimalController {

    public Animal animalCreator(AnimalType animalType, AnimalTitle animalTitle,
                                String name, LocalDate birthDate) {
        return switch (animalTitle) {
            case DOG -> new Dog(name, birthDate);
            case CAT -> new Cat(name, birthDate);
            case HAMSTER -> new Hamster(name, birthDate);
            case HORSE -> new Horse(name, birthDate);
            case CAMEL -> new Camel(name, birthDate);
            case DONKEY -> new Donkey(name, birthDate);
        };
    }
}
