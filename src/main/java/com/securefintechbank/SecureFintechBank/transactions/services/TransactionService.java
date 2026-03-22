package com.securefintechbank.SecureFintechBank.transactions.services;

import com.securefintechbank.SecureFintechBank.res.Response;
import com.securefintechbank.SecureFintechBank.transactions.dtos.TransactionDTO;
import com.securefintechbank.SecureFintechBank.transactions.dtos.TransactionRequest;

import java.util.List;

public interface TransactionService {
    Response<?> createTransaction(TransactionRequest transactionRequest);
    Response<List<TransactionDTO>> getTransactionsForMyAccount(String accountNumber, int page, int size);
}
