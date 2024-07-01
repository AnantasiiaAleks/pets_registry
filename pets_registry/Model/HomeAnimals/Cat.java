package Model.HomeAnimals;

import Model.AnimalTitle;

import java.time.LocalDate;

public class Cat extends HomeAnimal{

    public String currentTitle = AnimalTitle.CAT.getTitle();
    public Cat(String name, LocalDate birthDate) {
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
