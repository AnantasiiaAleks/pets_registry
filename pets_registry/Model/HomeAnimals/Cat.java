package Model.HomeAnimals;

import Model.AnimalTitle;
import Model.AnimalType;

import java.time.LocalDate;

public class Cat extends HomeAnimal{

    public String currentTitle = AnimalTitle.CAT.getTitle();
    public Cat(String name, LocalDate birthDate) {
        super(name, birthDate);
        AnimalType animalType = AnimalType.HOMEANIMAL;
        AnimalTitle animalTitle = AnimalTitle.CAT;
    }


    @Override
    public String toString() {
        return "Animal: " +
                currentType + ", " + currentTitle +
                ", id=" + getId() +
                ", name='" + getName() + '\'' +
                ", birthDate=" + getBirthDate().toString() +
                '.';
    }
}
