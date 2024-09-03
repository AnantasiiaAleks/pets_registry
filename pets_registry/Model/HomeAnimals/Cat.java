package Model.HomeAnimals;

import Model.AnimalTitle;
import java.time.LocalDate;

public class Cat extends HomeAnimal{

    public Cat(String name, LocalDate birthDate) {
        super(name, birthDate);
        setAnimalTitle(AnimalTitle.CAT);
    }
}
