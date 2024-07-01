package Model;

public class Command {
    private String commandTitle;


    public Command(String commandTitle) {
        this.commandTitle = commandTitle;
    }

    public String getCommandTitle() {
        return commandTitle;
    }

    public void setCommandTitle(String commandTitle) {
        this.commandTitle = commandTitle;
    }

    @Override
    public String toString() {
        return "Command: " + commandTitle;
    }
}
