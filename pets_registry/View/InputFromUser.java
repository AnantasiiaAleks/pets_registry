package View;

import java.time.LocalDate;
import java.util.Scanner;

import static java.time.LocalDate.parse;

public interface InputFromUser {

    static String inputText(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();
    }

    static LocalDate inputDate(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return parse(sc.nextLine());
    }
}
