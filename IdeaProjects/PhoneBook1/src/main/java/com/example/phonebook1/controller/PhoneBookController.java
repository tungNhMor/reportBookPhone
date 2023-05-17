package com.example.phonebook1.controller;


import com.example.phonebook1.model.PhoneBook;
import com.example.phonebook1.service.PhoneBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/phonebook")
public class PhoneBookController {
    @Autowired
    private PhoneBookService phoneBookService;

    @GetMapping("/list")
    public String getAll(Model model){
        List<PhoneBook> list = phoneBookService.getAll();
        model.addAttribute("list",list);
        return "phonebook/listPhoneBook";
    }
    @GetMapping("/add")
    public String add(Model model){
        return "phonebook/add";
    }
}
