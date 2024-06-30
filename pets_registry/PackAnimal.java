import java.time.LocalDate;

public abstract class PackAnimal extends Animal{
    public PackAnimal(String name, LocalDate birthDate) {
        super(name, birthDate);
        AnimalType animalType = AnimalType.PACKANIMAL;
    }
}
