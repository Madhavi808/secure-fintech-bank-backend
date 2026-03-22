package com.securefintechbank.SecureFintechBank.audit_dashboard.service;

import com.securefintechbank.SecureFintechBank.account.dtos.AccountDTO;
import com.securefintechbank.SecureFintechBank.auth_users.dtos.UserDTO;
import com.securefintechbank.SecureFintechBank.transactions.dtos.TransactionDTO;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface AuditorService {

    Map<String, Long> getSystemTotals();

    Optional<UserDTO> findUserByEmail(String email);

    Optional<AccountDTO> findAccountDetailsByAccountNumber(String accountNumber);

    List<TransactionDTO> findTransactionsByAccountNumber(String accountNumber);

    Optional<TransactionDTO> findTransactionById(Long transactionId);
}
