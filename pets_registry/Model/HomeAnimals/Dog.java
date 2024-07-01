package Model.HomeAnimals;

import Model.AnimalTitle;
import java.time.LocalDate;

public class Dog extends HomeAnimal{
    public Dog(String name, LocalDate birthDate) {
        super(name, birthDate);
        AnimalTitle animalTitle = AnimalTitle.DOG;
    }
}
