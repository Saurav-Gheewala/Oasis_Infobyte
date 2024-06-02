package com.oasis.ATM.service;

import com.oasis.ATM.model.*;
import com.oasis.ATM.repository.TransactionRepository;
import com.oasis.ATM.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class ATMService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    TransactionRepository transactionRepository;

    @Transactional
    public ResponseEntity<String> deposit(String accountNumber , Double depositAmount)
    {
        User user = userRepository.findByAccountNumber(accountNumber);
        user.setBalance(user.getBalance() + depositAmount);
        userRepository.save(user);
        recordTransaction(user, "Deposit", depositAmount);
        return new ResponseEntity<>("Done", HttpStatus.OK);
    }

    @Transactional
    public void withdraw(String accountNumber, double amount) {
        User user = userRepository.findByAccountNumber(accountNumber);
        if (user.getBalance() >= amount) {
            user.setBalance(user.getBalance() - amount);
            userRepository.save(user);
            recordTransaction(user, "Withdrawal", amount);
        } else {
            throw new IllegalArgumentException("Insufficient funds");
        }
    }

    @Transactional
    public void transfer(String fromAccountNumber, String toAccountNumber, double amount) {
        withdraw(fromAccountNumber, amount);
        deposit(toAccountNumber, amount);
    }

    private void recordTransaction(User user, String type, double amount) {
        Transaction transaction = new Transaction();
        transaction.setAccountNumber(user.getAccountNumber());
        transaction.setType(type);
        transaction.setAmount(amount);
        transaction.setTimestamp(LocalDateTime.now());
        transaction.setUser(user);
        transaction.setClearBalance(user.getBalance());
        transactionRepository.save(transaction);
    }
    public List<TransactionWrapper> getTransactionHistory(String accountNumber) {
        System.out.println("Hello");
        User user = userRepository.findByAccountNumber(accountNumber);
        List<TransactionWrapper> list = new ArrayList<>();
        List<Transaction> transactions = user.getTransactions();
        for(Transaction model : transactions)
        {
            TransactionWrapper wrapper = new TransactionWrapper();
            wrapper.setAmount(model.getAmount());
            wrapper.setType(model.getType());
            wrapper.setTimestamp(model.getTimestamp());
            wrapper.setAccountNumber(model.getAccountNumber());
            wrapper.setClearBalance(model.getClearBalance());
            list.add(wrapper);
        }

        return list;
    }
}
