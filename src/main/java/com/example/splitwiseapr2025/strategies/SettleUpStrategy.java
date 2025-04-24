package com.example.splitwiseapr2025.strategies;

import com.example.splitwiseapr2025.models.Expense;

import java.util.List;

public interface SettleUpStrategy {
    List<Expense> settleUp(List<Expense> expenses);
}
