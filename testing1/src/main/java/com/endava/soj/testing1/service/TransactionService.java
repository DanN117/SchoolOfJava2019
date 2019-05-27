package com.endava.soj.testing1.service;

import com.endava.soj.testing1.entity.Transaction;
import com.endava.soj.testing1.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    public void addTransaction(Transaction transaction) {
        if (transaction == null) {
            throw new IllegalArgumentException("!!!");
        }

        if (transaction.getAmount() < 0) {
            throw new IllegalArgumentException("!!!");
        }

        transactionRepository.addTransaction(transaction);
    }

    public Transaction getTransactionById(long id) {
        return transactionRepository.getTransactionById(id);
    }
}
