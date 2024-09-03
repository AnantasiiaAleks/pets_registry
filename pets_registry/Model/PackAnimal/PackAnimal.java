package Model.PackAnimal;

import Model.Animal;
import Model.AnimalType;
import java.time.LocalDate;

public abstract class PackAnimal extends Animal {
    public PackAnimal(String name, LocalDate birthDate) {
        super(name, birthDate);
        setAnimalType(AnimalType.PACKANIMAL);
    }
}
