package com.example.splitwiseapr2025.dtos;

import com.example.splitwiseapr2025.models.Expense;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SettleUpGroupResponseDto {
    private List<Expense> transactions;
}
