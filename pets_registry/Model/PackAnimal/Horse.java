package Model.PackAnimal;

import Model.AnimalTitle;
import Model.AnimalType;

import java.time.LocalDate;

public class Horse extends PackAnimal{
    public String currentTitle = AnimalTitle.HORSE.getTitle();
    public Horse(String name, LocalDate birthDate) {
        super(name, birthDate);
        AnimalType animalType = AnimalType.PACKANIMAL;
        AnimalTitle animalTitle = AnimalTitle.HORSE;
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
