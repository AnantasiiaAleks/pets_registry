package Model;

import java.util.ArrayList;
import java.util.List;

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

    public List<String> setCommandsList(String command) {
        List<String> commands = new ArrayList<>();
        commands.add(command);
        return commands;
    }
    public String getCommandsList (List<String> commands) {
        return commands.toString();
    }
}
