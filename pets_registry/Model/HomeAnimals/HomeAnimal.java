package Model.HomeAnimals;

import Model.Animal;
import Model.AnimalType;
import java.time.LocalDate;

public abstract class HomeAnimal extends Animal {
    public HomeAnimal(String name, LocalDate birthDate) {
        super(name, birthDate);
        setAnimalType(AnimalType.HOMEANIMAL);
    }
}
