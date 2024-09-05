import Controller.AnimalController;
import Model.DataBase.AnimalsDataBase;
import View.*;

public class Application {
    public static void start() throws Exception {
        AnimalController animalController = new AnimalController(new AnimalsDataBase());
        UserInterface userInterface = new ConsoleUserInterface(animalController);

        while (true) {
            MainMenu command = userInterface.showMainMenu();
            switch (command) {
                case SHOWALLANIMALS -> userInterface.showRegistry();
                case ADDANIMAL -> {
                    boolean result = userInterface.showAddAnimal();
                    if (!result) {
                        System.out.println("Не удалось сделать запись");
                    }
                    System.out.println("Успешно");
                }
                case SEARCHANDDELETE -> {
                    AnimalMenu secondCommand = userInterface.showAnimalMenu();
                    switch (secondCommand) {
                        case SHOWANINALINFO -> userInterface.showAnimal();
                        case ABILITIES -> {
                            AbilitiesMenu thirdCommand = userInterface.showAbilitiesMenu();
                            switch (thirdCommand) {
                                case SHOWABILITIES -> userInterface.showAnimalAbilities();
                                case ADDABILITY -> userInterface.showAddNewAbility();
                                case EXITTOANIMALMENU -> {
                                    start();
                                    return;
                                }
                            }
                        }
                        case DELETEANIMAL -> {
                            boolean delResult = userInterface.showDeleteAnimal();
                            if (!delResult) {
                                System.out.println("Не удалось удалить запись");
                            }
                            System.out.println("Удалено успешно");
                        }
                        case EXITUP -> {
                            start();
                            return;
                        }
                    }
                }
                case EXIT -> {
                    System.out.println("Пока");
                    return;
                }
            }
        }
    }
}
