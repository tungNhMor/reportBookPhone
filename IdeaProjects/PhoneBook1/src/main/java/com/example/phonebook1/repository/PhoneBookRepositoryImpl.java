package com.example.phonebook1.repository;

import com.example.phonebook1.model.BookPhoneRowMapper;
import com.example.phonebook1.model.PhoneBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class PhoneBookRepositoryImpl implements PhoneBookRepository{


    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public List<PhoneBook> getAll() {
        return jdbcTemplate.query("select * from phone_book",new BookPhoneRowMapper());
    }

    @Override
    public List<PhoneBook> getByCriteria(String strSearch) {
        return null;
    }

    @Override
    public void add() {

    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }

    @Override
    public PhoneBook getById() {
        return null;
    }
}
