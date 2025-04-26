package com.ibrahim.financeManagement.Business.Concretes;

import com.ibrahim.financeManagement.Business.Abstracts.IAuthService;
import com.ibrahim.financeManagement.Business.Requests.LoginRequest;
import com.ibrahim.financeManagement.Business.Requests.RegisterRequest;
import com.ibrahim.financeManagement.Business.Response.AuthResponse;
import com.ibrahim.financeManagement.Business.Response.UserResponse;
import com.ibrahim.financeManagement.Core.Mappers.IModelMapperService;
import com.ibrahim.financeManagement.DataAccess.Abstracts.IUserRepository;
import com.ibrahim.financeManagement.Entities.Concretes.User;
import jakarta.servlet.http.HttpServletRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AuthManager implements IAuthService {

    @Override
    public AuthResponse register(RegisterRequest registerRequest) {
        return null;
    }

    @Override
    public AuthResponse login(LoginRequest loginRequest) {
        return null;
    }

    @Override
    public UserResponse getCurrentUser() {
        return null;
    }
}
