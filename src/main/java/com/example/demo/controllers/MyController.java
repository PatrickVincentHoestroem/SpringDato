package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.demo.services.Calculator;

@Controller
public class MyController {

    @GetMapping("/dateCal")
    @ResponseBody
    public String echo(@RequestParam String dato) {
        Calculator calculator = new Calculator();
        return calculator.dateCal(dato);
    }
}