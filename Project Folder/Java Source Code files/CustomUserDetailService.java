package com.sheryians.major.service;

import com.sheryians.major.model.User;
import com.sheryians.major.repo.UserRepo;
import com.sheryians.major.model.CustomUserDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class CustomUserDetailService implements UserDetailsService {
    @Autowired
    UserRepo userRepo;
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<User> user = userRepo.findUserByEmail(email);
        user.orElseThrow(()-> new UsernameNotFoundException("User Not Found!"));
        return user.map(CustomUserDetail::new).get();
    }
}
