package View;

public interface UserInterface {

    void showRegistry();
    MainMenu showMainMenu();
    AnimalMenu showAnimalMenu();
    AbilitiesMenu showAbilitiesMenu();
    boolean showAddAnimal() throws Exception;
    void showAnimal();
    boolean showDeleteAnimal();
    void showAnimalAbilities();
    boolean showAddNewAbility();


}
