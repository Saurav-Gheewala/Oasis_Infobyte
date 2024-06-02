package com.oasis.ATM.controller;

import com.oasis.ATM.model.*;
import com.oasis.ATM.service.ATMService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/atm")
public class ATMController {
    @Autowired
    ATMService atmService;
    @GetMapping("/transactions")
    public List<TransactionWrapper> getTransactionHistory(@RequestParam String accountNumber) {
        System.out.println("Heelo");
        return atmService.getTransactionHistory(accountNumber);
    }
    @PostMapping("/withdraw")
    public void withdraw(@RequestBody AccountAndAmountModel accountAndAmountModel) {
        atmService.withdraw(accountAndAmountModel.getAccountNumber(), accountAndAmountModel.getAmount());
    }
    @PostMapping("/deposit")
    public ResponseEntity<String> deposit(@RequestBody AccountAndAmountModel accountAndAmountModel) {
        System.out.println("djd");
        return atmService.deposit(accountAndAmountModel.getAccountNumber(), accountAndAmountModel.getAmount());
    }

    @PostMapping("/transfer")
    public void transfer(@RequestBody MoneyTransferModel moneyTransferModel) {
        atmService.transfer(moneyTransferModel.getFromAccountNumber(), moneyTransferModel.getToAccountNumber(), moneyTransferModel.getAmount());
    }
}
