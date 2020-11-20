package com.wojtek.controller;

import com.wojtek.component.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MainController {

    private Calculator calculator;

    @Autowired
    public MainController(Calculator calculator) {
        this.calculator = calculator;
    }

    @GetMapping("/calc")
    public String home() {
        return "index";
    }

    @PostMapping("/calc")
    public String calculate(@RequestParam(defaultValue = "0") int valueA,
                            @RequestParam(defaultValue = "0") int valueB,
                            @RequestParam String operator,
                            HttpServletRequest request) {

        int result = calculator.calcResult(valueA, valueB, operator);
        request.setAttribute("result", result);
        return "result";
    }

}
