package View;

import Controller.AnimalController;
import Model.Ability;
import Model.Animal;
import Model.AnimalInfo;
import Model.AnimalTitle;
import Utilities.Counter;
import Utilities.InputFromUser;

import java.time.DateTimeException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ConsoleUserInterface implements UserInterface{
    private final AnimalController animalController;

    public ConsoleUserInterface(AnimalController animalController) {
        this.animalController = animalController;
    }




    @Override
    public MainMenu showMainMenu() {
        System.out.println("\f");
        System.out.println("Регистр животных, версия 1.0\n");
        System.out.println("Главное меню:");
        System.out.println(MainMenu.printMainMenu());
        while (true) {
            try {
                System.out.println("Выберите пункт меню: ");
                Scanner sc = new Scanner(System.in);
                MainMenu command = MainMenu.values()[sc.nextInt()];
                return command;
            }
            catch (IndexOutOfBoundsException e) {
                System.out.println("Некорректный ввод.");
            }
        }
    }

    @Override
    public void showRegistry() {
        System.out.println("\f");
        System.out.println("Регистр животных, версия 1.0\n");
        List<Animal> allAnimals = animalController.getAllAnimals();
        for (Animal oneAnimal : allAnimals) {
            System.out.println(oneAnimal.toString());
        }
    }

    @Override
    public boolean showAddAnimal() throws Exception {
        System.out.println("\f");
        System.out.println("Внесите информацию о животном:\n" +
                "имя дата_рождения(дд.мм.гггг) вид\n" +
                "виды животных, доступные для внесения: " + Arrays.asList(AnimalTitle.values()));
        while(true) {
            Counter counter = new Counter();
            try (counter){
                String inputData = InputFromUser.inputText("Ввод: ");
                AnimalInfo animalInfo = InputFromUser.parseAnimalInfoFromUser(inputData);
                counter.add();
                return animalController.createNewAnimal(animalInfo.animalType(), animalInfo.animalTitle(), animalInfo.name(), animalInfo.birthDate());
            }
            catch (IllegalArgumentException e) {
                System.out.println("Неверный ввод");
            }
            catch (DateTimeException e) {
                System.out.println("Неверная дата");
            }
        }
    }

    @Override
    public AnimalMenu showAnimalMenu() {
        System.out.println("\f");
        System.out.println("Регистр животных, версия 1.0\n");
        System.out.println("Меню управления записью о питомце:");
        System.out.println(AnimalMenu.printAnimalMenu());
        while (true) {
            try {
                System.out.println("Выберите пункт меню: ");
                Scanner sc = new Scanner(System.in);
                AnimalMenu secondCommand = AnimalMenu.values()[sc.nextInt()];
                return secondCommand;
            }
            catch (IndexOutOfBoundsException e) {
                System.out.println("Некорректный ввод.");
            }
        }
    }

    @Override
    public void showAnimal() {
        System.out.println("\f");
        System.out.println("Регистр животных, версия 1.0\n");
        Animal animal = searchAnimal();
        printInfo(animal);
    }

    @Override
    public boolean showDeleteAnimal() {
        System.out.println("\f");
        System.out.println("Регистр животных, версия 1.0\n");
        Animal animal = searchAnimal();
        return animalController.deleteAnimal(animal);
    }

    @Override
    public AbilitiesMenu showAbilitiesMenu() {
        System.out.println("\f");
        System.out.println("Регистр животных, версия 1.0\n");
        System.out.println("Меню управления умениями:");
        System.out.println(AbilitiesMenu.printAbilitiesMenu());
        while (true) {
            try {
                System.out.println("Выберите пункт меню: ");
                Scanner sc = new Scanner(System.in);
                AbilitiesMenu thirdCommand = AbilitiesMenu.values()[sc.nextInt()];
                return thirdCommand;
            }
            catch (IndexOutOfBoundsException e) {
                System.out.println("Некорректный ввод.");
            }
        }
    }
    @Override
    public void showAnimalAbilities() {
        System.out.println("\f");
        System.out.println("Регистр животных, версия 1.0\n");
        Animal animal = searchAnimal();
        System.out.println(animal.toString());
        System.out.println("Умения:\t" + animal.getAnimalAbilities().toString());
    }

    @Override
    public boolean showAddNewAbility() {
        System.out.println("\f");
        System.out.println("Регистр животных, версия 1.0\n");
        Animal animal = searchAnimal();
        String newAbility = InputFromUser.inputText("Введите название нового умения: ");
        if (newAbility.length() <= 1) {
            System.out.println("Некорректное название умения");
            return false;
        }
        animal.learnAbility(new Ability(newAbility));
        return true;
    }

    private Animal searchAnimal() {
        System.out.println("Выберите питомца для добавления умения");
        System.out.printf("Для поиска записи, введите ID (1 - %d)", animalController.getAllAnimals().size());
        while (true) {
            try {
                int number = InputFromUser.inputInt("Введите число: ");
                return animalController.getAllAnimals().get(number - 1);
            }
            catch (IndexOutOfBoundsException e) {
                System.out.println("Такой ID отсутствует в БД.");
            }
        }
    }

    private void printInfo(Animal animal) {
        System.out.println("\f");
        System.out.println("ID:\t" + animal.getAnimalId());
        System.out.println("Тип животного:\t" + animal.getAnimalType());
        System.out.println("Вид животного:\t" + animal.getAnimalTitle());
        System.out.println("Имя:\t" + animal.getName());
        System.out.println("Дата рождения:\t" + animal.getBirthDateString());
        System.out.println("Возраст (месяцев):\t" + animal.age(animal.getBirthDate()));
        System.out.println("Умения:\t" + animal.getAnimalAbilities().toString());
    }

}
