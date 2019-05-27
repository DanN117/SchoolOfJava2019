package com.endava.soj.testing1.service;

import com.endava.soj.testing1.entity.Transaction;
import com.endava.soj.testing1.repository.TransactionRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class TransactionServiceTest {

    public static final long ID = 100L;
    @InjectMocks
    private TransactionService transactionService;

        @Mock
    private TransactionRepository transactionRepository;

        @Test
    public void testAddTransaction() {
            Transaction transaction = new Transaction();
            transaction.setId(100L);
            transaction.setAmount(120.0);
            transaction.setName("Ion");

            transactionService.addTransaction(transaction);

            Mockito.verify(transactionRepository,Mockito.times(1)).addTransaction(transaction);
        }


        @Test (expected = IllegalArgumentException.class)
    public void testAddTransactionWhenInputIsNullThrowAnException() {
            transactionService.addTransaction(null);
        }

        @Test (expected = IllegalArgumentException.class)
    public void testAddTransactionWhenInputIsInvalidThrownException () {
            Transaction transaction = new Transaction();
            transaction.setId(100L);
            transaction.setAmount(-120.0);
            transaction.setName("Ion");

            transactionService.addTransaction(transaction);
    }

    Transaction transaction;

        @Before
        public void setUp() {

            transaction = new Transaction();
            transaction.setId(ID);
            transaction.setAmount(120.0);
            transaction.setName("Ion");
        }

    @Test
    public void testGetTransaction() {
        Mockito.when(transactionRepository.getTransactionById(ID))
                .thenReturn(transaction);

        Transaction actualTransaction = transactionService.getTransactionById(ID);

        assertEquals(transaction.getId(), actualTransaction.getId());

        assertEquals(transaction.getAmount(), actualTransaction.getAmount(), 0.01);

        assertEquals(transaction.getName(), actualTransaction.getName());

    }
}