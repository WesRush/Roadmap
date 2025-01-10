package Cem.Dias.RoadmapJava.javacore.Aintroducaoclasses.Bintroducaometodos.test;

import Cem.Dias.RoadmapJava.javacore.Aintroducaoclasses.Bintroducaometodos.dominio.Calculator;

public class CalculatorTest05 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int [] numbers = { 1,2,3,4,5};
        calculator.arraySum(numbers);
        calculator.varArgsSum(1,2,4,5,6,67);//muda o tipo de chamada, os números passados aqui virarão arrays
    }
}
