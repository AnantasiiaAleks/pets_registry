package Model.PackAnimal;

import Model.AnimalTitle;
import Model.AnimalType;

import java.time.LocalDate;

public class Donkey extends PackAnimal{
    public String currentTitle = AnimalTitle.DONKEY.getTitle();
    public Donkey(String name, LocalDate birthDate) {
        super(name, birthDate);
        AnimalType animalType = AnimalType.PACKANIMAL;
        AnimalTitle animalTitle = AnimalTitle.DONKEY;
    }
    @Override
    public String toString() {
        return "Animal: " +
                currentType + ", " + currentTitle +
                ", id=" + getAnimalId() +
                ", name='" + getName() + '\'' +
                ", birthDate=" + getBirthDate().toString() +
                '.';
    }
}
