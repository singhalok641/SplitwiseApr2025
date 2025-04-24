package com.example.splitwiseapr2025.controllers;

import com.example.splitwiseapr2025.dtos.SettleUpGroupRequestDto;
import com.example.splitwiseapr2025.dtos.SettleUpGroupResponseDto;
import com.example.splitwiseapr2025.dtos.SettleUpUserRequestDto;
import com.example.splitwiseapr2025.dtos.SettleUpUserResponseDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/settleUp")
public class SettleUpController {
    public SettleUpUserResponseDto settleUpUser(SettleUpUserRequestDto requestDto) {
        return null;
    }

    public SettleUpGroupResponseDto settleUpGroup(SettleUpGroupRequestDto requestDto) {
        return null;
    }
}
