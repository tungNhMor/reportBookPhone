package com.example.phonebook1.service;

import com.example.phonebook1.model.PhoneBook;
import com.example.phonebook1.repository.PhoneBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhoneBookServiceImpl implements  PhoneBookService{
    @Autowired
    private PhoneBookRepository phoneBookRepository;
    @Override
    public List<PhoneBook> getAll() {
        return phoneBookRepository.getAll();
    }
}
