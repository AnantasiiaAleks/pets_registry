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

    public static AnimalTitle getAnimalByTitle(String title) {
        for (AnimalTitle anim : values()) {
            if (anim.getTitle().equals(title)) {
                return anim;
            }
        }

        throw new IllegalArgumentException("No animal found with title: [" + title + "]");
    }

    public String getTitle() {
        return animTitle;
    }
}
