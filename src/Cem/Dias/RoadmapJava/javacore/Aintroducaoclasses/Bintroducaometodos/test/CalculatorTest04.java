package Cem.Dias.RoadmapJava.javacore.Aintroducaoclasses.Bintroducaometodos.test;

import Cem.Dias.RoadmapJava.javacore.Aintroducaoclasses.Bintroducaometodos.dominio.Calculator;

public class CalculatorTest04 {
    public static void main(String[] args) {
        //teste para exemplificar que quando se passa variável do tipo primitivo a classe fará uma cópia
        Calculator calculator = new Calculator();
        int num1 = 1;
        int num2 = 2;
        calculator.twoNumAlter(num1, num2);
        System.out.println("Dentro do CalculatorTest04");
        System.out.println("num1 "+num1);
        System.out.println("num1 "+num2);

    }
}
