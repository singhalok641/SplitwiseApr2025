package com.example.splitwiseapr2025.dtos;

import com.example.splitwiseapr2025.models.Expense;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SettleUpUserResponseDto {
    // These transactions are stored in our system as dummy expenses
    private List<Expense> transactions;
}
