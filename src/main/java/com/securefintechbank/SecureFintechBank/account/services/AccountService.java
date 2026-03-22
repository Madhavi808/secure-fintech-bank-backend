package com.securefintechbank.SecureFintechBank.account.services;

import com.securefintechbank.SecureFintechBank.account.dtos.AccountDTO;
import com.securefintechbank.SecureFintechBank.account.entity.Account;
import com.securefintechbank.SecureFintechBank.auth_users.entity.User;
import com.securefintechbank.SecureFintechBank.enums.AccountType;
import com.securefintechbank.SecureFintechBank.res.Response;

import java.util.List;

public interface AccountService {

    Account createAccount(AccountType accountType, User user);

    Response<List<AccountDTO>> getMyAccounts();

    Response<?> closeAccount(String accountNumber);
}
