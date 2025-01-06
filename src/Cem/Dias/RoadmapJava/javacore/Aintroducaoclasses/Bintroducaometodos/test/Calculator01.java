package Cem.Dias.RoadmapJava.javacore.Aintroducaoclasses.Bintroducaometodos.test;

import Cem.Dias.RoadmapJava.javacore.Aintroducaoclasses.Bintroducaometodos.dominio.Calculator;

public class Calculator01 {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        //diferente das referencias, o metodos se põe o nome do metodo seguido de parentese, como no exemplo abaixo
        calculator.twoNumSum();
        calculator.twoNumSub();
        System.out.println("Finalizando");
    }
}
