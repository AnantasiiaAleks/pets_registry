package View;

public enum AbilitiesMenu {
    EXITTOANIMALMENU("Выход в главное меню"),
    ADDABILITY("Добавить новую команду"),
    SHOWABILITIES("Показать умения питомца");

    private final String abilitiesMenuCommand;

    AbilitiesMenu(String abilitiesMenuCommand) {
        this.abilitiesMenuCommand = abilitiesMenuCommand;
    }

    public String getAbilitiesMenuCommand() {
        return abilitiesMenuCommand;
    }

    public static String printAbilitiesMenu() {
        return String.format(
                "%d.\t%s\n%d.\t%s\n%d\t%s",
                AbilitiesMenu.SHOWABILITIES.ordinal(), AbilitiesMenu.SHOWABILITIES.getAbilitiesMenuCommand(),
                AbilitiesMenu.ADDABILITY.ordinal(), AbilitiesMenu.ADDABILITY.getAbilitiesMenuCommand(),
                AbilitiesMenu.EXITTOANIMALMENU.ordinal(), AbilitiesMenu.EXITTOANIMALMENU.getAbilitiesMenuCommand());
    }
}
