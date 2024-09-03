package Model.PackAnimal;

import Model.AnimalTitle;
import java.time.LocalDate;

public class Camel extends PackAnimal{

    public Camel(String name, LocalDate birthDate) {
        super(name, birthDate);
        setAnimalTitle(AnimalTitle.CAMEL);
    }
}
