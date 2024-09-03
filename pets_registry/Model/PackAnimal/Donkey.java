package Model.PackAnimal;

import Model.AnimalTitle;
import java.time.LocalDate;

public class Donkey extends PackAnimal{

    public Donkey(String name, LocalDate birthDate) {
        super(name, birthDate);
        setAnimalTitle(AnimalTitle.DONKEY);
    }
}
