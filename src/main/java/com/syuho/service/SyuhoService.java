package com.syuho.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.syuho.domain.model.repository.SyuhoRepository;
import com.syuho.domain.model.syuho.Syuho;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class SyuhoService {

    private final SyuhoRepository syuhoRepository;
    
    public List<Syuho> findAll() {
        return syuhoRepository.findAll();
    }
}
