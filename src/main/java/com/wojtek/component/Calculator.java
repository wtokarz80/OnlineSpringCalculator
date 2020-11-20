package com.wojtek.component;


import org.springframework.stereotype.Component;

@Component
public class Calculator {

    public Calculator() {
    }

    public int calcResult(int valueA, int valueB, String operator){
        int result = 0;
        switch (operator){
            case "add":
                result = valueA + valueB;
                break;
            case "subtract":
                result = valueA - valueB;
                break;
            case "multiply":
                result = valueA * valueB;
                break;
            case "divide":
                result = valueA / valueB;
                break;
        }
        return result;
    }


}
