package Model;

public enum AnimalType {
    HOMEANIMAL("Home animal"),
    PACKANIMAL("Pack animal");

    private final String animType;

    AnimalType (String animType) {
        this.animType = animType;
    }
    public String getAnimType() {
        return animType;
    }

}
