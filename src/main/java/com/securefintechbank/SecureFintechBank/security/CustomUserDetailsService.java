package com.securefintechbank.SecureFintechBank.security;

import com.securefintechbank.SecureFintechBank.auth_users.entity.User;
import com.securefintechbank.SecureFintechBank.auth_users.repo.UserRepo;
import com.securefintechbank.SecureFintechBank.exceptions.NotFoundException;
import lombok.RequiredArgsConstructor;
//import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user =userRepo.findByEmail(username)
                .orElseThrow(()-> new NotFoundException("Email Not Found"));

        return AuthUser.builder()
                .user(user)
                .build();
    }
}
