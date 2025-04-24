package com.example.splitwiseapr2025;

import com.example.splitwiseapr2025.commands.AddGroupCommand;
import com.example.splitwiseapr2025.commands.CommandExecutor;
import com.example.splitwiseapr2025.commands.RegisterUserCommand;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class SplitwiseApr2025Application {

    public static void main(String[] args) {
        SpringApplication.run(SplitwiseApr2025Application.class, args);

        CommandExecutor.addCommand(new AddGroupCommand());
        CommandExecutor.addCommand(new RegisterUserCommand());
        Scanner scanner = new Scanner(System.in);

        while(true){
            String input = scanner.next();
            CommandExecutor.execute(input);
        }
    }

}
