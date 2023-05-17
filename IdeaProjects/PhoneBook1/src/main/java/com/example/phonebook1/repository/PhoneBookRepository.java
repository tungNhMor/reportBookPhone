package com.example.phonebook1.repository;

import com.example.phonebook1.model.PhoneBook;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface PhoneBookRepository {

    public List<PhoneBook> getAll();
    public List<PhoneBook> getByCriteria(String strSearch);
    public void add();
    public void update();
    public void delete();
    public PhoneBook getById();
}
