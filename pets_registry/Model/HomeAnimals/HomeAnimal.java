package Model.HomeAnimals;

import Model.Animal;
import Model.AnimalType;
import java.time.LocalDate;

public abstract class HomeAnimal extends Animal {
    public String currentType = AnimalType.HOMEANIMAL.getAnimType();
    public HomeAnimal(String name, LocalDate birthDate) {
        super(name, birthDate);

    }
}
