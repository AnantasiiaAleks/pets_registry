package Model.DataBase;

import Model.Animal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnimalsDataBase implements DataBase{

    Map<Integer, Animal> animalsDB = new HashMap<>();


    @Override
    public boolean addAnimal(Animal animal) {
        if (animalsDB.containsKey(animal.getAnimalId())) {
            return false;
        }
        animalsDB.put(animal.getAnimalId(), animal);
        return true;
    }

    @Override
    public List<Animal> showAllAnimals() {
        List<Animal> animalList = new ArrayList<>();
        animalList.addAll(animalsDB.values());
        return animalList;
    }

    @Override
    public Animal searchAnimalById(int animalId) {
        return animalsDB.getOrDefault(animalId, null);
    }

    @Override
    public boolean deleteAnimalFromDB(int animalId) {
        if (animalsDB.containsKey(animalId)) {
            return false;
        }
        animalsDB.remove(animalId);
        return true;
    }
}
