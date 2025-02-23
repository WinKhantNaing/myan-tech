package com.winkhant.myan_tech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/delivery-status")
public class DeliveryController {

    @GetMapping
    public String delivery(){
        return "delivery";
    }
}
