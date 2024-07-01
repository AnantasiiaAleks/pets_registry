package Model.PackAnimal;

import Model.AnimalTitle;

import java.time.LocalDate;

public class Horse extends PackAnimal{
    public String currentTitle = AnimalTitle.HORSE.getTitle();
    public Horse(String name, LocalDate birthDate) {
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
