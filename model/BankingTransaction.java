package pl.globallogic.bankingapp.model;

import java.time.LocalDate;

public class BankingTransaction {

    public BankingTransaction(LocalDate transactionDate, String accountNumber, double amount, String transactionType){
        this.transactionDate = transactionDate;
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.transactionType = transactionType;
    }
public LocalDate getTransactionDate() {
    return transactionDate;
}

public String getAccountNumber
