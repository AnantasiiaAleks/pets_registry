package Model;

public enum AnimalType {
    HOMEANIMAL("Домашние животные"),
    PACKANIMAL("Вьючные животные");

    private final String type;

    AnimalType (String animType) {
        this.type = animType;
    }

    public String getType() {
        return type;
    }

}
