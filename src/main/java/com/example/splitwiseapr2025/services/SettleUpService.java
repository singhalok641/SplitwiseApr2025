package com.example.splitwiseapr2025.services;

import com.example.splitwiseapr2025.exceptions.UserNotFoundException;
import com.example.splitwiseapr2025.models.Expense;
import com.example.splitwiseapr2025.models.User;
import com.example.splitwiseapr2025.models.UserExpense;
import com.example.splitwiseapr2025.repositories.UserExpenseRepository;
import com.example.splitwiseapr2025.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.*;


@Service
public class SettleUpService {
    private UserRepository userRepository;
    private UserExpenseRepository userExpenseRepository;

    public SettleUpService(UserRepository userRepository,
                           UserExpenseRepository userExpenseRepository) {
        this.userRepository = userRepository;
        this.userExpenseRepository = userExpenseRepository;
    }

    public List<Expense> settleUpUser(Long userId) throws UserNotFoundException {
        Optional<User> userOptional = userRepository.findById(userId);
        
        if(userOptional.isEmpty()){
            throw new UserNotFoundException("This user does not exist");
        }
        
        User user = userOptional.get();
        
        // Fetch all the expenses where this user is involved
        List<UserExpense> userExpenses = userExpenseRepository.findByUser(user);

        /*
        UE1, -> U1, E3(paid By)
        UE2, -> U1, E1
        UE3  -> U1, E3(had to pay)
         */

        Set<Expense> expensesToSettle = new HashSet<>();
        
        for (UserExpense userExpense: userExpenses) {
            expensesToSettle.add(userExpense.getExpense());
        }



        return null;
    }

    public List<Expense> settleUpGroup(Long groupId) {
        return null;
    }
}
