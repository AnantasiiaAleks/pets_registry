package View;

import Model.Animal;
import Model.AnimalTitle;
import Model.AnimalType;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;



public class UI {

    public void printMenu() {
        System.out.println("__________*** MENU ***__________");
        System.out.println("Press 1-4 to select any command:\n" +
                "*1* Add new animal.\n" +
                "*2* Search animal.\n" +
                "*3* Show all animals.\n" +
                "*4* Quit. ");
    }

    public void addNewAnimal() {
        String getTitle = InputFromUser.inputText("Please input your animals title").toLowerCase();
        AnimalTitle animalTitle = AnimalTitle.getAnimalByTitle(getTitle);
        AnimalType animalType = AnimalType.getAnimalByItsTitle(animalTitle);
        String name = InputFromUser.inputText("Please enter name");
        LocalDate birthdate = InputFromUser.inputDate("Please enter birth date");
    }
}
