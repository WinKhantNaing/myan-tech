package com.winkhant.myan_tech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("orders")
public class OrderController {

    @GetMapping
    public String getOrders(){
        return "order";
    }
}
