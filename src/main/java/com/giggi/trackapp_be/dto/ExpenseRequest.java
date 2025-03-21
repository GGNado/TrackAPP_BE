package com.giggi.trackapp_be.dto;

import com.giggi.trackapp_be.entity.Categoria;
import com.giggi.trackapp_be.entity.Expense;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class ExpenseRequest {
    private String id;
    private String nome;
    private double spesa;
    private LocalDate data;
    private Categoria categoria;


    public Expense toExpense() {
        Expense expense = new Expense();
        expense.setNome(nome);
        expense.setSpesa(spesa);
        expense.setData(data.toString());
        expense.setCategoria(categoria);
        return expense;
    }
}
