package com.example.phonebook1.service;

import com.example.phonebook1.model.PhoneBook;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PhoneBookService {
    public List<PhoneBook> getAll();
}
