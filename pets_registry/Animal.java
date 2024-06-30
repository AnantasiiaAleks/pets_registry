import java.time.LocalDate;
import java.time.Period;

public abstract class Animal {
    private static int counter;
    private final int id = counter++;
    private String name;
    private LocalDate birthDate;


    public Animal(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate.toString() +
                '}';
    }

    public int age (LocalDate birthDate) {
        return (Period.between(birthDate, LocalDate.now())).getMonths();
    }
}
