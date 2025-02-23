package com.winkhant.myan_tech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customers")
public class CustomerShopsController {

    @GetMapping("/shops")
    public String showCustomers(){
        return "customer-shops";
    }
}
