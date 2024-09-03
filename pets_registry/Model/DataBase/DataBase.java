package Model.DataBase;

import Model.Animal;

import java.util.List;

public interface DataBase {

    boolean addAnimal(Animal animal);

    List<Animal> showAllAnimals();

    Animal searchAnimalById(int animalId);

    boolean deleteAnimal(int animalId);
}
