package Model;

public enum AnimalTitle {
    DOG("dog"),
    CAT("cat"),
    HAMSTER("hamster"),
    HORSE("horse"),
    CAMEL("camel"),
    DONKEY("donkey");

    private final String animTitle;

    AnimalTitle (String animTitle) {
        this.animTitle = animTitle;
    }
    public String getTitle() {
        return animTitle;
    }
}
