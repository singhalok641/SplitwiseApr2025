package com.example.splitwiseapr2025.repositories;

import com.example.splitwiseapr2025.models.User;
import com.example.splitwiseapr2025.models.UserExpense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserExpenseRepository extends JpaRepository<UserExpense, Long> {
    // select * from user_expense where user_id = ..
    List<UserExpense> findByUser(User user);
}
