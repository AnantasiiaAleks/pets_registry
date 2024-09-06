package View;

public enum MainMenu {
    EXIT("Выход"),
    SHOWALLANIMALS("Показать всех животных"),
    ADDANIMAL("Добавить животное"),
    SEARCHANDDELETE("Поиск и удаление");

    private final String menuCommand;

    MainMenu(String menuCommand) {
        this.menuCommand = menuCommand;
    }
    public String getMenuCommand() {
        return menuCommand;
    }

    public static String printMainMenu() {
        return String.format(
                "%d.\t%s\n%d.\t%s\n%d.\t%s\n%d.\t%s",
                MainMenu.SHOWALLANIMALS.ordinal(), MainMenu.SHOWALLANIMALS.getMenuCommand(),
                MainMenu.ADDANIMAL.ordinal(), MainMenu.ADDANIMAL.getMenuCommand(),
                MainMenu.SEARCHANDDELETE.ordinal(), MainMenu.SEARCHANDDELETE.getMenuCommand(),
                MainMenu.EXIT.ordinal(),MainMenu.EXIT.getMenuCommand());
    }
}
