package Cem.Dias.RoadmapJava.javacore.Aintroducaoclasses.Bintroducaometodos.test;

import Cem.Dias.RoadmapJava.javacore.Aintroducaoclasses.Bintroducaometodos.dominio.Calculator;

public class CalculatorTest03 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
       double result = calculator.twoNumDiv(20,0);// quando o metodo tem um tipo de variável é necessário iniciá-la para que retorne
        System.out.println(result);
    }
}
