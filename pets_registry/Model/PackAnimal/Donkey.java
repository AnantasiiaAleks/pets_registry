package Model.PackAnimal;

import Model.AnimalTitle;

import java.time.LocalDate;

public class Donkey extends PackAnimal{
    public String currentTitle = AnimalTitle.DONKEY.getTitle();
    public Donkey(String name, LocalDate birthDate) {
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
