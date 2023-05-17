package com.example.phonebook1.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PhoneBook {
    private Integer id;
    private String firstName;
    private String lastName;
    private String phoneNumber;

}
