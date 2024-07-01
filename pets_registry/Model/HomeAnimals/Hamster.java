package Model.HomeAnimals;

import Model.AnimalTitle;

import java.time.LocalDate;

public class Hamster extends HomeAnimal{
    public String currentTitle = AnimalTitle.HAMSTER.getTitle();
    public Hamster(String name, LocalDate birthDate) {
        super(name, birthDate);

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
