package Utilities;

import Model.Animal;
import Model.AnimalInfo;
import Model.AnimalTitle;
import Model.AnimalType;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

import static java.time.LocalDate.parse;

public interface InputFromUser {

    static AnimalInfo parseAnimalInfoFromUser(String text) {
        String[] animalInfo = text.split(" ");
        String infoName = null;
        LocalDate infoBirthDate = null;
        AnimalTitle infoTitle = null;

        if (animalInfo.length != 3) {
            throw new IllegalArgumentException("Вы ввели неверное количество данных");
        }
        if (DataValidator.isTextValid(animalInfo[0])) {
            infoName = animalInfo[0];
        }
        if (DataValidator.isDateValid(animalInfo[1])) {
            infoBirthDate = LocalDate.parse(animalInfo[1]);
        }
        if (AnimalTitle.contains(animalInfo[2])) {
            infoTitle = AnimalTitle.valueOf(animalInfo[2].toUpperCase());
        }
        AnimalType animalType = typeByTitle(animalInfo[2].toLowerCase());
        return new AnimalInfo(animalType, infoTitle, infoName, infoBirthDate);
    }

    private static AnimalType typeByTitle(String title){
        if (title.equals("кошка") || title.equals("собака") || title.equals("хомяк")) {
            return AnimalType.HOMEANIMAL;
        }
        if (title.equals("лошадь") || title.equals("верблюд") || title.equals("осел")) {
            return AnimalType.PACKANIMAL;
        }
        throw new IllegalArgumentException("Не найдено");
    }

    static String inputText(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();
    }

    static int inputInt(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextInt();
    }

    default LocalDate inputDate(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return parse(sc.nextLine());
    }
}
