package com.example.splitwiseapr2025.commands;

public interface Command {
    boolean matches(String input);
    void execute(String input);
}
