package Cem.Dias.RoadmapJava.javacore.Aintroducaoclasses.Bintroducaometodos.test;

import Cem.Dias.RoadmapJava.javacore.Aintroducaoclasses.Bintroducaometodos.dominio.PrintStudent;
import Cem.Dias.RoadmapJava.javacore.Aintroducaoclasses.Bintroducaometodos.dominio.Student;

public class StudentTest01 {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        PrintStudent print = new PrintStudent();

        student1.name = "Caco";
        student1.age = 15;
        student1.gender = 'M';

        student2.name = "Marcela";
        student2.age = 16;
        student2.gender = 'F';

        print.print(student1);
        print.print(student2);
    }
}
