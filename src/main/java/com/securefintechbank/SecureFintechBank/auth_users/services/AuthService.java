package com.securefintechbank.SecureFintechBank.auth_users.services;

import com.securefintechbank.SecureFintechBank.auth_users.dtos.LoginRequest;
import com.securefintechbank.SecureFintechBank.auth_users.dtos.LoginResponse;
import com.securefintechbank.SecureFintechBank.auth_users.dtos.RegistrationRequest;
import com.securefintechbank.SecureFintechBank.auth_users.dtos.ResetPasswordRequest;
import com.securefintechbank.SecureFintechBank.res.Response;

public interface AuthService {
    Response<String > register(RegistrationRequest request);
    Response<LoginResponse> login(LoginRequest loginRequest);
    Response<? > forgetPassword(String email);
    Response<? > updatePasswordViaResetCode(ResetPasswordRequest resetPasswordRequest);
}
