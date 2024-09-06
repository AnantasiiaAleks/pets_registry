package View;

public enum AnimalMenu {
    EXITUP("Возврат в главное меню"),
    SHOWANINALINFO("Показать информацию о животном"),
    ABILITIES("Умения"),
    DELETEANIMAL("Удалить животное из базы данных");

    private final String animalMenuCommand;

    AnimalMenu(String animalMenuCommand) {
        this.animalMenuCommand = animalMenuCommand;
    }
    public String getAnimalMenuCommand() {
        return animalMenuCommand;
    }

    public static String printAnimalMenu() {
        return String.format(
                "%d.\t%s\n%d.\t%s\n%d.\t%s\n%d.\t%s",
                AnimalMenu.SHOWANINALINFO.ordinal(), AnimalMenu.SHOWANINALINFO.getAnimalMenuCommand(),
                AnimalMenu.ABILITIES.ordinal(), AnimalMenu.ABILITIES.getAnimalMenuCommand(),
                AnimalMenu.DELETEANIMAL.ordinal(), AnimalMenu.DELETEANIMAL.getAnimalMenuCommand(),
                AnimalMenu.EXITUP.ordinal(),AnimalMenu.EXITUP.getAnimalMenuCommand());
    }
}
