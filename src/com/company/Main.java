package com.company;

public class Main {

    public static void main(String[] args) {
        long number = 144;
        Calculator calculator = new Calculator();
        calculator.Remainder(number);
        calculator.ToOctal(number);
        calculator.GetFactorial(number);
        System.out.println(calculator.IsFibonacci(number));
        System.out.println(calculator.IsSimple(number));
    }
}
