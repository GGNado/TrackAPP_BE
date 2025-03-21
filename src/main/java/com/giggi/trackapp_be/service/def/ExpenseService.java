package com.giggi.trackapp_be.service.def;

import com.giggi.trackapp_be.entity.Expense;

import java.time.LocalDateTime;
import java.util.List;

public interface ExpenseService {
    void addExpense(Expense expense);
    void deleteExpense(int id);
    void deleteExpense(String nome, String data);

    void deleteExpense(Expense expense);

    List<Expense> getExpenses();
}
