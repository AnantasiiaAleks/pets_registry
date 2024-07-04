package Model.HomeAnimals;

import Model.AnimalTitle;
import Model.AnimalType;

import java.time.LocalDate;

public class Dog extends HomeAnimal{
    public String currentTitle = AnimalTitle.DOG.getTitle();
    public Dog(String name, LocalDate birthDate) {
        super(name, birthDate);
        AnimalType animalType = AnimalType.HOMEANIMAL;
        AnimalTitle animalTitle = AnimalTitle.DOG;
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
