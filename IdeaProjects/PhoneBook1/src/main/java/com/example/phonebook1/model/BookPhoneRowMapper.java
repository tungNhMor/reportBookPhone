package com.example.phonebook1.model;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BookPhoneRowMapper implements RowMapper<PhoneBook> {
    @Override
    public PhoneBook mapRow(ResultSet rs, int rowNum) throws SQLException {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.setId(rs.getInt("id"));
        phoneBook.setFirstName(rs.getString("first_name"));
        phoneBook.setLastName(rs.getString("last_name"));
        phoneBook.setPhoneNumber(rs.getString("phone_number"));
        return phoneBook;
    }
}
