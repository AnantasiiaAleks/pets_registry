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
        System.out.println("Press 1-5 to select any command:\n" +
                "*1* Add new animal.\n" +
                "*2* Search animal.\n" +
                "*3* Show all animals.\n" +
                "*4* Learn new command.\n" +
                "*5* Quit. \n" +
                "\n" +
                "Your choice: ");
    }

    public void addNewAnimal() {
        String getTitle = InputFromUser.inputText("Please input your animals title: ").toLowerCase();
        AnimalTitle animalTitle = AnimalTitle.getAnimalByTitle(getTitle);
        AnimalType animalType = AnimalType.getAnimalByItsTitle(animalTitle);
        String name = InputFromUser.inputText("Please enter name: ");
        LocalDate birthdate = InputFromUser.inputDate("Please enter birth date: ");
    }

    public void searchAnimal() {
        int query = InputFromUser.inputInt("Please enter id for searching: ");
    }

    public void showAllAnimals(){
        System.out.println("All animals: ");
    }

    public void learnNewCommand() {
        int query = InputFromUser.inputInt("First you need to find an animal. Please enter id: ");
        String newCommand = InputFromUser.inputText("Enter new command: ");
    }
    public void quit(){
        System.out.println("Bye-bye!");
    }
}
