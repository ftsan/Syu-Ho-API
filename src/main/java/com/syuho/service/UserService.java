package com.syuho.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.syuho.domain.model.account.User;
import com.syuho.domain.model.repository.UserRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    
    public Optional<User> findById(long userId) {
        return userRepository.findById(userId);
    }
}
