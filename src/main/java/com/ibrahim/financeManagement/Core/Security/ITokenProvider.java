package com.ibrahim.financeManagement.Core.Security;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;

public interface ITokenProvider {

    String generateToken(UserDetails userDetails);
    boolean validateToken(String token);
    String getUserName(String token);
    int getUserId(String token);
}
