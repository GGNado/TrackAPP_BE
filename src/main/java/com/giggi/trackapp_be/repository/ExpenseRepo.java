package com.giggi.trackapp_be.repository;

import com.giggi.trackapp_be.entity.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepo extends JpaRepository<Expense, Integer> {

    Expense findByNome(String nome);
}
