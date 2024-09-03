package Model;

public class Ability {
    private String abilityName;

    public Ability(String abilityName) {
        this.abilityName = abilityName;
    }
    public String getAbilityName() {
        return abilityName;
    }
    public void setAbilityName(String abilityName) {
        this.abilityName = abilityName;
    }

    @Override
    public String toString() {
        return abilityName;
    }

}
