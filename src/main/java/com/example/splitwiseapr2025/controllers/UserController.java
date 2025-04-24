package com.example.splitwiseapr2025.controllers;

import com.example.splitwiseapr2025.dtos.RegisterUserRequestDto;
import com.example.splitwiseapr2025.dtos.RegisterUserResponseDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    public RegisterUserResponseDto registerUser(RegisterUserRequestDto requestDto) {
        return null;
    }

}
