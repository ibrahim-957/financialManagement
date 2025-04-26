package com.ibrahim.financeManagement.Business.Abstracts;

import com.ibrahim.financeManagement.Business.Requests.LoginRequest;
import com.ibrahim.financeManagement.Business.Requests.RegisterRequest;
import com.ibrahim.financeManagement.Business.Response.AuthResponse;
import com.ibrahim.financeManagement.Business.Response.UserResponse;
import com.ibrahim.financeManagement.Entities.Concretes.User;

public interface IAuthService {
    AuthResponse register(RegisterRequest registerRequest);
    AuthResponse login(LoginRequest loginRequest);
    UserResponse getCurrentUser();
}
