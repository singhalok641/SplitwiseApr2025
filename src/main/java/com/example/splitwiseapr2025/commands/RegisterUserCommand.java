package com.example.splitwiseapr2025.commands;

import com.example.splitwiseapr2025.controllers.UserController;
import com.example.splitwiseapr2025.dtos.RegisterUserRequestDto;
import com.example.splitwiseapr2025.dtos.RegisterUserResponseDto;

import java.util.List;

public class RegisterUserCommand implements Command{
    private UserController userController;

    public RegisterUserCommand() {
    }

    //Register vinsmokesanji 003 namisswwaann
    @Override
    public boolean matches(String input) {
        List<String> words = List.of(input.split(""));
        // [Register, vinsmokesanji, 003, namisswwaann]
        return words.size() == 4 && words.get(0).equals(CommandKeywords.registerCommand);
    }

    @Override
    public void execute(String input) {
        List<String> words = List.of(input.split(""));
        RegisterUserRequestDto requestDto = new RegisterUserRequestDto();
        requestDto.setUsername(words.get(1));
        requestDto.setPhoneNumber(words.get(2));
        requestDto.setPassword(words.get(3));

        RegisterUserResponseDto responseDto = userController.registerUser(requestDto);
    }
}
