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

}
