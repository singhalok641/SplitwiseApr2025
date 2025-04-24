package com.example.splitwiseapr2025.commands;

import java.util.ArrayList;
import java.util.List;

public class CommandExecutor {
    private static List<Command> commands = new ArrayList<>();

    public static void addCommand(Command command) {
        commands.add(command);
    }

    public static void removeCommand(Command command) {
        commands.remove(command);
    }

    public static void execute(String input) {
        for (Command command: commands) {
            if (command.matches(input)) {
                System.out.println("Executing ..." + command);
                command.execute(input);
                break;
            }
        }
    }
}
