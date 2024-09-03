package Model;

import Controller.Counter;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


public abstract class Animal {
    private static int counter;
    protected int animalId = ++counter;
    protected AnimalType animalType;
    protected AnimalTitle animalTitle;
    protected String name;
    protected LocalDate birthDate;
    protected List<Ability> animalAbilities;

    public Animal(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
        animalAbilities = new ArrayList<>();
    }

    public int getAnimalId() { return animalId; }

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

    public AnimalType getAnimalType() { return animalType; }
    public void setAnimalType(AnimalType animalType) { this.animalType = animalType; }

    public AnimalTitle getAnimalTitle() { return animalTitle; }
    public void setAnimalTitle(AnimalTitle animalTitle) { this.animalTitle = animalTitle; }

    public List<Ability> getAnimalAbilities() { return animalAbilities; }

    public String getBirthDateString() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return dateTimeFormatter.format(birthDate);
    }

    public int age (LocalDate birthDate) {
        return (Period.between(birthDate, LocalDate.now())).getMonths();
    }

    @Override
    public String toString() {
        return String.format("d%. %s, %s. name: s%, birthday: s%", getAnimalId(),
                AnimalType.getAnimType(), AnimalTitle.getTitle(), getName(),
                getBirthDateString());
    }

    public boolean learnAbility (Ability ability) {
        if (animalAbilities.contains(ability)) {
            return false;
        }
        animalAbilities.add(ability);
        return true;
    }



}
