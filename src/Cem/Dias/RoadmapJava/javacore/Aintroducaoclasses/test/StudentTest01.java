package Cem.Dias.RoadmapJava.javacore.Aintroducaoclasses.test;

import Cem.Dias.RoadmapJava.javacore.Aintroducaoclasses.dominio.Student;

public class StudentTest01 {
    public static void main(String[] args) {
        //o java automaticamente importa outra classe
        Student student = new Student();
        //nomedaclasse. - significar acessar uma variável
        student.name = "João";
        student.age = 21;
        student.gender = 'M';
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.gender);

    }
}
