package Model.PackAnimal;

import Model.AnimalTitle;

import java.time.LocalDate;

public class Camel extends PackAnimal{
    public String currentTitle = AnimalTitle.CAMEL.getTitle();
    public Camel(String name, LocalDate birthDate) {
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
