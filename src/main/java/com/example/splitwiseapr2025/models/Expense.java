package com.example.splitwiseapr2025.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity(name = "expenses")
public class Expense extends BaseModel{
    private String description;
    private double amount;

    @ManyToOne
    private User createdBy;

    @Enumerated(EnumType.ORDINAL)
    private ExpenseType expenseType;

    @OneToMany
    @JoinColumn(name = "expense_id")
    private List<UserExpense> userExpenses;
}

/*
   1           1
Expense ----- User => M:1
   M           1

   1              M
Expense ----- UserExpense => 1:M
   1                1
E1               U1E1 ->
E2               U1E2
E3               U2E1
 */