package com.company;

public class Main {

    public static void main(String[] args) {
        long number = 7;
        Calculator calculator = new Calculator(number);
        calculator.Remainder();
        calculator.ToOctal();
        calculator.GetFactorial();
        System.out.println(calculator.IsFibonacci());
        System.out.println(calculator.IsSimple());

        // write your code here
    }
}
