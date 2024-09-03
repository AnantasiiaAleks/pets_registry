package Utilities;

import java.text.SimpleDateFormat;

public class DataValidator {
    boolean isDateValid(String dateStr) {
        SimpleDateFormat myFormat = new SimpleDateFormat("dd.MM.yyyy");
        myFormat.setLenient(false);
        try {
            myFormat.parse(dateStr);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isTextValid(String text){
        if (text.length() > 1){
            for (int i = 0; i < text.length(); i++) {
                if (text.matches("^[А-Яа-я]+$") ||
                        text.matches("^[a-zA-Z]+$") ||
                        text.charAt(i) == '-') {
                    return true;
                }
            }
        }
        return false;
    }
}
