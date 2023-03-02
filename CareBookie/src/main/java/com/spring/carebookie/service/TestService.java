package com.spring.carebookie.service;

import org.springframework.stereotype.Service;

import com.spring.carebookie.entity.BookTypeEntity;
import com.spring.carebookie.repository.TestRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class TestService {

    private TestRepository testRepository;

    public java.util.List<BookTypeEntity> getAllBookTypes() {
        return testRepository.findAll();
    }
}
