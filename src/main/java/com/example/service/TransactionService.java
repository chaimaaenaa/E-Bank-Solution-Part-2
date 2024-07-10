package com.example.service;

import com.example.entity.Transaction;
import com.example.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    public Transaction createTransaction(Transaction transaction) {
        return transactionRepository.save(transaction);
    }


    public Optional<Transaction> getTransactionById(Long id) {
        return transactionRepository.findById(id);
    }

    public List<Transaction> getAllTransactions() {
        return transactionRepository.findAll();
    }

    public Transaction updateTransaction(Long id, Transaction transactionDetails) {
        Optional<Transaction> transaction = transactionRepository.findById(id);
        if (transaction.isPresent()) {
            Transaction existingTransaction = transaction.get();
            existingTransaction.setTransactionDate(transactionDetails.getTransactionDate());
            existingTransaction.setAmount(transactionDetails.getAmount());
            existingTransaction.setTransactionType(transactionDetails.getTransactionType());
            existingTransaction.setDescription(transactionDetails.getDescription());
            return transactionRepository.save(existingTransaction);
        }
        return null;
    }

    public void deleteTransaction(Long id) {
        transactionRepository.deleteById(id);
    }
}
