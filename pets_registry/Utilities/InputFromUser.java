package Utilities;

import Model.Animal;
import Model.AnimalInfo;
import Model.AnimalTitle;
import Model.AnimalType;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.time.LocalDate.parse;

public interface InputFromUser {

    static AnimalInfo parseAnimalInfoFromUser(List<String> animalInfoList) {
//        String[] animalInfo = text.split(" ");
//        String infoName = null;
//        LocalDate infoBirthDate = null;
//        AnimalTitle infoTitle = null;
        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        if (animalInfoList.size() != 3) {
            throw new IllegalArgumentException("Вы ввели неверное количество данных");
        }
        String infoName = animalInfoList.get(0);
        LocalDate infoBirthDate = LocalDate.parse(animalInfoList.get(1), myFormat);
        AnimalTitle infoTitle = AnimalTitle.valueOf(animalInfoList.get(2).toUpperCase());
//        if (DataValidator.isTextValid(animalInfo[0])) {
//            infoName = animalInfo[0];
//        }
//        if (DataValidator.isDateValid(animalInfo[1])) {
//            infoBirthDate = LocalDate.parse(animalInfo[1]);
//        }
//        if (AnimalTitle.contains(animalInfo[2])) {
//            infoTitle = AnimalTitle.valueOf(animalInfo[2].toUpperCase());
//        }
        AnimalType animalType = typeByTitle(animalInfoList.get(2).toUpperCase());
        return new AnimalInfo(animalType, infoTitle, infoName, infoBirthDate);
    }

    private static AnimalType typeByTitle(String title){
        if (title.equals("CAT") || title.equals("DOG") || title.equals("HAMSTER")) {
            return AnimalType.HOMEANIMAL;
        }
        if (title.equals("HORSE") || title.equals("CAMEL") || title.equals("DONKEY")) {
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
