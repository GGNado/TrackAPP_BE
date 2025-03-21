package com.giggi.trackapp_be.service;

import com.giggi.trackapp_be.entity.Expense;
import com.giggi.trackapp_be.repository.ExpenseRepo;
import com.giggi.trackapp_be.service.def.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Service
public class ExpenseServiceImpl implements ExpenseService {
    private ExpenseRepo expenseRepo;

    @Autowired
    public ExpenseServiceImpl(ExpenseRepo expenseRepo) {
        this.expenseRepo = expenseRepo;
    }

    @Override
    public void addExpense(Expense expense) {
        expenseRepo.save(expense);
    }

    @Override
    public void deleteExpense(int id) {
        expenseRepo.deleteById(id);
    }

    @Override
    public void deleteExpense(String nome, String data) {
        List<Expense> expenses = expenseRepo.findAll();

        System.out.println(expenses);

        for (Expense expense : expenses) {
            System.out.println("Sto controllando " + expense.getNome() + " e " + expense.getData() + " con " + nome + " e " + data);
            if (expense.getNome().equalsIgnoreCase(nome) && data.contains(expense.getData())) {
                expenseRepo.deleteById(expense.getId());
                return;
            }
        }
    }

    @Override
    public void deleteExpense(Expense expense) {
        expense = expenseRepo.findByNome(expense.getNome());
        expenseRepo.deleteById(expense.getId());
    }

    @Override
    public List<Expense> getExpenses() {
        return expenseRepo.findAll();
    }
}
