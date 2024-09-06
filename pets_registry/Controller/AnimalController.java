package Controller;

import Model.Animal;
import Model.AnimalTitle;
import Model.AnimalType;
import Model.DataBase.DataBase;
import Model.HomeAnimals.Cat;
import Model.HomeAnimals.Dog;
import Model.HomeAnimals.Hamster;
import Model.PackAnimal.Camel;
import Model.PackAnimal.Donkey;
import Model.PackAnimal.Horse;

import java.time.LocalDate;
import java.util.List;

public class AnimalController {

    private final DataBase animalsDataBase;

    public AnimalController(DataBase animalsDataBase) {
        this.animalsDataBase = animalsDataBase;
    }

    public List<Animal> getAllAnimals() {
        return animalsDataBase.showAllAnimals();
    }

    public boolean createNewAnimal(AnimalType animalType, AnimalTitle animalTitle,
                                   String name, LocalDate birthDate) {
        Animal newAnimal = switch (animalTitle) {
            case DOG -> new Dog(name, birthDate);
            case CAT -> new Cat(name, birthDate);
            case HAMSTER -> new Hamster(name, birthDate);
            case HORSE -> new Horse(name, birthDate);
            case CAMEL -> new Camel(name, birthDate);
            case DONKEY -> new Donkey(name, birthDate);
        };
        return animalsDataBase.addAnimal(newAnimal);
    }

    public boolean deleteAnimal(Animal animal) {
        return animalsDataBase.deleteAnimalFromDB(animal.getAnimalId());
    }





}
