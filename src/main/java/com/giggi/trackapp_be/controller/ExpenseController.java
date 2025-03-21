package com.giggi.trackapp_be.controller;

import com.giggi.trackapp_be.dto.ExpenseRequest;
import com.giggi.trackapp_be.entity.Expense;
import com.giggi.trackapp_be.service.def.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ExpenseController {
    private ExpenseService expenseService;

    @Autowired
    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @GetMapping("/expenses")
    public List<Expense> getExpenses() {
        return expenseService.getExpenses();
    }

    @PostMapping("/expenses")
    public void addExpense(@RequestBody ExpenseRequest expense) {
        System.out.println(expense);
        System.out.println(expense.getSpesa());
        expenseService.addExpense(expense.toExpense());
    }

    @DeleteMapping("/expenses/{id}")
    public void deleteExpense(@PathVariable int id) {
        expenseService.deleteExpense(id);
    }

    @DeleteMapping("/expenses/nome/{nome}/data/{data}")
    public void deleteExpense(@PathVariable String nome, @PathVariable String data) {
        expenseService.deleteExpense(nome, data);
    }

}
