package Model;

public enum AnimalTitle {
    DOG("собака"),
    CAT("кошка"),
    HAMSTER("хомяк"),
    HORSE("лошадь"),
    CAMEL("верблюд"),
    DONKEY("осел");

    private final String title;

    AnimalTitle (String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public static boolean contains(String str) {
        for (AnimalTitle title : AnimalTitle.values()) {
            if (title.name().equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }


}
